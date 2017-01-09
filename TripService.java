package org.craftedsw.kata.trip;

import static java.util.Collections.emptyList;

import java.util.List;

import org.craftedsw.kata.exception.UserNotLoggedInException;
import org.craftedsw.kata.user.User;
import org.craftedsw.kata.user.UserSession;

public class TripService {

    public List<Trip> getTripsByUser(User user) throws UserNotLoggedInException {
        User loggedUser = UserSession.getInstance().getLoggedUser();
        if (loggedUser != null) {
            return user.getFriends().contains(loggedUser) ? TripDAO.findTripsByUser(user)
                    : emptyList();
        } else {
            throw new UserNotLoggedInException();
        }
    }
}
