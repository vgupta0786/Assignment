package org.craftedsw.kata;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;

import org.craftedsw.kata.exception.UserNotLoggedInException;
import org.craftedsw.kata.trip.Trip;
import org.craftedsw.kata.trip.TripDAO;
import org.craftedsw.kata.trip.TripService;
import org.craftedsw.kata.user.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ TripDAO.class })
public class TripServiceTest {

    private TripService tripService;
    private User loggedUser;

    @Before
    public void setUp() {
        loggedUser = Mockito.mock(User.class);
        tripService = new TripService();
        prepareMocks();
    }

    private void prepareMocks() {
        mockStatic(TripDAO.class);
    }

    @Test(expected = UserNotLoggedInException.class)
    public void throw_user_not_logged_exception_when_logged_user_is_null() throws Exception {
        tripService.getTripsByUser(any(User.class), null);
    }

    @Test
    public void return_trips_when_logged_user_is_a_friend() throws Exception {
        User user = new User();
        user.addFriend(loggedUser);
        when(TripDAO.class, "findTripsByUser", any(User.class)).thenReturn(
                unmodifiableList(asList(new Trip())));
        assertEquals(1, tripService.getTripsByUser(user, loggedUser).size());
    }

    @Test
    public void return_no_trips_when_logged_user_is_not_a_friend() throws Exception {
        when(TripDAO.class, "findTripsByUser", any(User.class)).thenReturn(
                unmodifiableList(asList(new Trip())));
        assertEquals(0, tripService.getTripsByUser(new User(), loggedUser).size());
    }

}
