/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package league.comparators;

import java.util.Comparator;
import league.entities.User;

/**
 * Copyright (c) 2009
 * @author Matus Goljer
 */
public class UserRankComparator implements Comparator<User> {

    public int compare(User o1, User o2) {
        return o1.getRank() - o2.getRank();
    }
}
