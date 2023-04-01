package com.vytrack.step_definitions;

import com.vytrack.utilities.*;
import org.junit.*;

import java.util.*;

public class SampleTest {

    @Test
    public void test1() {
        String query = "select concat(first_name,' ',last_name) \"full_name\", e.email \n" +
                "from orocrm_contact c inner join orocrm_contact_email e \n" +
                "on c.id = e.owner_id \n" +
                "where e.email = 'mrjakc@mail.ru'";

        DBUtils.createConnection();

        List<List<Object>> result = DBUtils.getQueryResultList(query);
        System.out.println(result);
        Assert.assertEquals(result.get(0).get(0),"Mister Californian");

    }
}

