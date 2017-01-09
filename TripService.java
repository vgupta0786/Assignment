package org.craftedsw.kata.trip;

import static java.util.Collections.emptyList;
import static java.util.Objects.isNull;

import java.util.List;

import org.craftedsw.kata.exception.UserNotLoggedInException;
import org.craftedsw.kata.user.User;

public class TripService {

    public List<Trip> getfriendTrips(User friend, User loggedInUser)
            throws UserNotLoggedInException {
        if (isNull(loggedInUser)) {
            throw new UserNotLoggedInException();
        } else {
            return friend.isFriend(loggedInUser) ? findTripsForfriends(friend) : emptyList();
        }
    }

    private List<Trip> findTripsForfriends(User friend) {
        return TripDAO.findTripsByUser(friend);
    }
}
