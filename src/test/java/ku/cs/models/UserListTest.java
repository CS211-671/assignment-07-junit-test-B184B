package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("rattaphon", "111");
        userList.addUser("sirin", "222");
        userList.addUser("warin", "333");
        // TODO: find one of them
        User user = userList.findUserByUsername("rattaphon");
        // TODO: assert that UserList found User
        String actual = user.getUsername();
        assertEquals("rattaphon", actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList list = new UserList();
        list.addUser("rattaphon", "111");
        list.addUser("sirin", "222");
        list.addUser("warin", "333");
        // TODO: change password of one user
        list.changePassword("rattaphon", "111", "111");
        // TODO: assert that user can change password
        assertTrue(list.changePassword("rattaphon", "111", "555"));
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList list = new UserList();
        list.addUser("rattaphon", "111");
        list.addUser("sirin", "222");
        list.addUser("warin", "333");
        // TODO: call login() with correct username and password
        User user = list.login("rattaphon", "111");
        // TODO: assert that User object is found
        assertEquals(user, list.login("rattaphon", "111"));
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList list = new UserList();
        list.addUser("rattaphon", "111");
        list.addUser("sirin", "222");
        list.addUser("warin", "333");
        // TODO: call login() with incorrect username or incorrect password
        User user = list.login("rattaphon", "666");
        // TODO: assert that the method return null
        assertNull(list.login("rattaphon", "666"));
    }

}