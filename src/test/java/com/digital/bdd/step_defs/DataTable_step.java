package com.digital.bdd.step_defs;
import com.digital.models.UserPojo;
import io.cucumber.java.en.Given;
import java.util.List;
import java.util.Map;
public class DataTable_step {
    @Given("create new user up with following data")
    public void create_new_user_up_with_following_data(io.cucumber.datatable.DataTable user) {
        List<List<String>> users = user.asLists();
        System.out.println(users.get(0).get(0));
    }
    @Given("create new user up with following data pojo")
    public void create_new_user_up_with_following_data_pojo(List<Map<String, String>> userData) {
        for (Map<String, String> entry : userData) {
            UserPojo user = createUserFromMap(entry);
            System.out.println(user.getFirstname());
        }
    }
    private UserPojo createUserFromMap(Map<String, String> entry) {
        return new UserPojo(
                entry.get("firstname"),
                entry.get("lastname"),
                entry.get("email")
        );
    }
}