package com.practice.array.Extras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunCurlJava {

    public void runCurlCommand(String command) {
        try {
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            StringBuilder builder = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
                builder.append("\n");
            }
            String result = builder.toString();
            System.out.print(result);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        String command = "curl -X GET -H Content-Type:application/json -H Accept:application/json -H loggedInUserId:agupt19 -i http://pqa.missioncontrol.walmart.com/api/manage/allgroups";
        RunCurlJava runCurlJava = new RunCurlJava();
        runCurlJava.runCurlCommand(command);

    }
}
