package data;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Configuration {

    private static JSONObject settingsObject = null;

    public static JSONObject getsetting()
    {
        if(settingsObject!=null)
            return settingsObject;
        else{
            String content="{}";
            try{
                content = new String(Files.readAllBytes(Paths.get("src/main/resources/settings.json")));
            }
            catch(IOException e){

            }
            settingsObject= new JSONObject(content);
                    return settingsObject;
        }
    }

}
