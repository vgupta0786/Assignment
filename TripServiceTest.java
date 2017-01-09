package org.craftedsw.kata;

import static java.util.Collections.unmodifiableList;

import org.craftedsw.kata.exception.UserNotLoggedInException;
import org.craftedsw.kata.trip.Trip;
import org.craftedsw.kata.trip.TripDAO;
import org.craftedsw.kata.trip.TripService;
import org.craftedsw.kata.user.User;
import org.craftedsw.kata.user.UserSession;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;
import static java.util.Arrays.asList;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ UserSession.class, TripDAO.class })
public class TripServiceTest {

    private TripService tripService;
    private UserSession mockUserSession;
    private User mockUser;

    @Before
    public void setUp() {
        mockUser = Mockito.mock(User.class);
        tripService = new TripService();
        prepareMocks();
    }

    private void prepareMocks() {
        mockUserSession = PowerMockito.mock(UserSession.class);
        mockStatic(UserSession.class);
        mockStatic(TripDAO.class);
    }

    @Test(expected = UserNotLoggedInException.class)
    public void throw_user_not_logged_exception_when_logged_user_is_null() throws Exception {
        when(UserSession.class, "getInstance").thenReturn(mockUserSession);
        when(mockUserSession.getLoggedUser()).thenReturn(null);
        tripService.getTripsByUser(null);
    }

    @Test
    public void return_trips_when_logged_user_is_a_friend() throws Exception {
        when(UserSession.class, "getInstance").thenReturn(mockUserSession);
        User user = new User();
        user.addFriend(mockUser);
        when(mockUserSession.getLoggedUser()).thenReturn(mockUser);
        when(TripDAO.class, "findTripsByUser", any(User.class)).thenReturn(
                unmodifiableList(asList(new Trip())));
        assertEquals(1, tripService.getTripsByUser(user).size());
    }

    @Test
    public void return_no_trips_when_logged_user_is_not_a_friend() throws Exception {
        when(UserSession.class, "getInstance").thenReturn(mockUserSession);
        when(mockUserSession.getLoggedUser()).thenReturn(mockUser);
        when(TripDAO.class, "findTripsByUser", any(User.class)).thenReturn(
                unmodifiableList(asList(new Trip())));
        assertEquals(0, tripService.getTripsByUser(new User()).size());
    }

}
