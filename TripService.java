package org.craftedsw.kata.trip;

import static java.util.Collections.emptyList;
import static java.util.Objects.isNull;

import java.util.List;

import org.craftedsw.kata.exception.UserNotLoggedInException;
import org.craftedsw.kata.user.User;
import org.craftedsw.kata.user.UserSession;

public class TripService {

    public List<Trip> getTripsByUser(User user) throws UserNotLoggedInException {
        User loggedUser = UserSession.getInstance().getLoggedUser();
        if (isNull(loggedUser)) {
            throw new UserNotLoggedInException();
        } else {
            return user.isFriend(loggedUser) ? TripDAO.findTripsByUser(user) : emptyList();
        }
    }
}
