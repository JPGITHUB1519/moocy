/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

/**
 *
 * @author Tester
 */
public class Browser {
    
    // append query to url
    public static URI appendQueryToUrl(String uri, String appendQuery) throws URISyntaxException {
        URI oldUri = new URI(uri);

        String newQuery = oldUri.getQuery();
        if (newQuery == null) {
            newQuery = appendQuery;
        } else {
            newQuery += "&" + appendQuery;  
        }

        URI newUri = new URI(oldUri.getScheme(), oldUri.getAuthority(),
                oldUri.getPath(), newQuery, oldUri.getFragment());

        return newUri;
    }
    public static void openWebpage(String urlString, String query) {
        try {
            //URI url = new URL(urlString).toURI();
            
            URI url = appendQueryToUrl(urlString, query);
            Desktop.getDesktop().browse(url);

        } catch (Exception e) {
            e.printStackTrace();
        }
     }
}
