
package com.orasi;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.By.*;
import org.openqa.selenium.*;
import com.orasi.datasource.*;


public class ObjectManager {
  private static final ObjectManager singleton = new ObjectManager();
  
  public static final ObjectManager instance() {
    return singleton;
  }
  
  private final Map<String,ByFactory> objectMap = new HashMap<>( 10 );
  
  private ObjectManager() {
    ByFactoryCollection bC = null;
    /*
    Site: www.omayo.com
    Add a description of www.omayo.com
    */
    /* Page: OMAYO.COM 
    
    */

    

bC = new ByFactoryCollection("name", "17278.1414");
bC.add( new ByFactory( ByXPath.class, "//INPUT[@id=\"name\"]", "IDRule", "17278.1416" ) );
bC.add( new ByFactory( ById.class, "name", "IDRule", "17278.1418" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"name\"]", "IDRule", "17278.1420" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@name=\"name\"]", "NameRule", "17278.1422" ) );
bC.add( new ByFactory( ByName.class, "name", "NameRule", "17278.1424" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"name\"]", "NameRule", "17278.1426" ) );


objectMap.put( "17278.1414", bC );


bC = new ByFactoryCollection("email", "17278.1432");
bC.add( new ByFactory( ByXPath.class, "//INPUT[@id=\"email\"]", "IDRule", "17278.1434" ) );
bC.add( new ByFactory( ById.class, "email", "IDRule", "17278.1436" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"email\"]", "IDRule", "17278.1438" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@name=\"email\"]", "NameRule", "17278.1440" ) );
bC.add( new ByFactory( ByName.class, "email", "NameRule", "17278.1442" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"email\"]", "NameRule", "17278.1444" ) );


objectMap.put( "17278.1432", bC );


bC = new ByFactoryCollection("phone", "17278.1447");
bC.add( new ByFactory( ByXPath.class, "//INPUT[@id=\"phone\"]", "IDRule", "17278.1449" ) );
bC.add( new ByFactory( ById.class, "phone", "IDRule", "17278.1451" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"phone\"]", "IDRule", "17278.1453" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@name=\"phone\"]", "NameRule", "17278.1455" ) );
bC.add( new ByFactory( ByName.class, "phone", "NameRule", "17278.1457" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"phone\"]", "NameRule", "17278.1459" ) );


objectMap.put( "17278.1447", bC );


bC = new ByFactoryCollection("Send", "17278.1463");
bC.add( new ByFactory( ByXPath.class, "//INPUT[@type='submit']", "AttributeRule", "17278.1465" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='submit']", "AttributeRule", "17278.1467" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@class='btn btn-lg btn-primary mt-1 pl-4 pr-4']", "AttributeRule", "17278.1469" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='btn btn-lg btn-primary mt-1 pl-4 pr-4']", "AttributeRule", "17278.1471" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@value='?���Send']", "AttributeRule", "17278.1473" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@value='?���Send']", "AttributeRule", "17278.1475" ) );


objectMap.put( "17278.1463", bC );


bC = new ByFactoryCollection("message", "17278.1478");
bC.add( new ByFactory( ByXPath.class, "//TEXTAREA[@name=\"message\"]", "NameRule", "17278.1480" ) );
bC.add( new ByFactory( ByName.class, "message", "NameRule", "17278.1482" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"message\"]", "NameRule", "17278.1484" ) );
bC.add( new ByFactory( ByXPath.class, "//LABEL[@class='col-sm-2 pl-0 col-form-label']/following-sibling::TEXTAREA[1]", "SiblingRule", "17278.1486" ) );
bC.add( new ByFactory( ByXPath.class, "//TEXTAREA[@class='form-control']", "AttributeRule", "17278.1488" ) );
bC.add( new ByFactory( ByXPath.class, "//TEXTAREA[@rows='2']", "AttributeRule", "17278.1490" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@rows='2']", "AttributeRule", "17278.1492" ) );
bC.add( new ByFactory( ByXPath.class, "//TEXTAREA[@autocomplete='off']", "AttributeRule", "17278.1494" ) );


objectMap.put( "17278.1478", bC );




  }
  
  public By getObject( Object alchemyIdentifier, Map<String,Object> contextMap, DataSourceProvider dM ) {
    
    if ( alchemyIdentifier instanceof By ) {
      return (By) alchemyIdentifier;
    }
    
    ByFactory by = objectMap.get( alchemyIdentifier + "" );
    if ( by == null ) {
      return new By() {
        @Override
        public List<WebElement> findElements(SearchContext sc) {
          throw new RuntimeException( "Could not find and object using [" + alchemyIdentifier + "]" );
        }
      };
    }
    return by.create(contextMap, dM);
  }

  public ByFactory getObject( String alchemyIdentifier ) {
   
    return objectMap.get( alchemyIdentifier );
  }
}
