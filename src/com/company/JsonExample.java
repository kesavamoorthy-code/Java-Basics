package com.company;
import org.json.simple.JSONObject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JsonExample
{
    public static void main(String[] args)
    {
        JSONObject obj = new JSONObject();
        Pattern pat = Pattern.compile(".*\"access_token\"\\s*:\\s*\"([^\"]+)\".*");
        String token = "";

        obj.put("issued_at", "1420260525643");
        obj.put("application_name", "ce1e94a2-9c3e-42fa-a2c6-1ee01815476b");
        obj.put("scope", "READ");
        obj.put("status", "approved");
        obj.put("api_product_list", "[PremiumWeatherAPI]");
        obj.put("expires_in", "1799");
        obj.put("developer.email", "tesla@weathersample.com");
        obj.put("organization_id", "0");
        obj.put("token_type", "BearerToken");
        obj.put("client_id", "5jUAdGv9pBouF0wOH5keAVI35GBtx3dT");
        obj.put("organization_name", "docs");
        obj.put("access_token", "XkhU2DFnMGIVL2hvsRHLM00hRWav");
//        obj.toString();

        Matcher mat = pat.matcher(obj.toString());
        if (mat.matches() && mat.groupCount() > 0) {
             token = mat.group(1);
        }

        System.out.print(token);

/*        obj.put("name", "foo");
        obj.put("num", new Integer(100));
        obj.put("balance", new Double(1000.21));
        obj.put("is_vip", new Boolean(true));

        System.out.print(obj);*/
    }
}



