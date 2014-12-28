/**
 * Sample Skeleton for "AddressbookGUI.fxml" Controller Class
 * You can copy and paste this code into your favorite IDE
 **/

package addressbook;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.ServerAddress;
import java.net.UnknownHostException;

import java.util.Arrays;



public class AddressbookGUIController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="adddtlid"
    private Button adddtlid; // Value injected by FXMLLoader

    @FXML // fx:id="addemlchid"
    private ChoiceBox<?> addemlchid; // Value injected by FXMLLoader

    @FXML // fx:id="addemlid"
    private Button addemlid; // Value injected by FXMLLoader

    @FXML // fx:id="addphnid"
    private Button addphnid; // Value injected by FXMLLoader

    @FXML // fx:id="addraddid"
    private Button addraddid; // Value injected by FXMLLoader

    @FXML // fx:id="addrchid"
    private ChoiceBox<?> addrchid; // Value injected by FXMLLoader

    @FXML // fx:id="addrlblid"
    private Label addrlblid; // Value injected by FXMLLoader

    @FXML // fx:id="bdlblid"
    private Label bdlblid; // Value injected by FXMLLoader

    @FXML // fx:id="cityid"
    private TextField cityid; // Value injected by FXMLLoader

    @FXML // fx:id="contactscrollid"
    private ScrollBar contactscrollid; // Value injected by FXMLLoader

    @FXML // fx:id="countryid"
    private TextField countryid; // Value injected by FXMLLoader

    @FXML // fx:id="daychkid"
    private ComboBox<?> daychkid; // Value injected by FXMLLoader

    @FXML // fx:id="deletecontactid"
    private Button deletecontactid; // Value injected by FXMLLoader

    @FXML // fx:id="editdeleteid"
    private MenuItem editdeleteid; // Value injected by FXMLLoader

    @FXML // fx:id="emailtxtid"
    private TextField emailtxtid; // Value injected by FXMLLoader

    @FXML // fx:id="emllblid"
    private Label emllblid; // Value injected by FXMLLoader

    @FXML // fx:id="firstid"
    private TextField firstid; // Value injected by FXMLLoader

    @FXML // fx:id="homescrollid"
    private ScrollBar homescrollid; // Value injected by FXMLLoader

    @FXML // fx:id="hometabeid"
    private Tab hometabeid; // Value injected by FXMLLoader

    @FXML // fx:id="housenoid"
    private TextField housenoid; // Value injected by FXMLLoader

    @FXML // fx:id="imageinsertid"
    private ImageView imageinsertid; // Value injected by FXMLLoader

    @FXML // fx:id="label"
    private Label label; // Value injected by FXMLLoader

    @FXML // fx:id="lastid"
    private TextField lastid; // Value injected by FXMLLoader

    @FXML // fx:id="listviewid"
    private ListView<?> listviewid; // Value injected by FXMLLoader

    @FXML // fx:id="mapshowid"
    private ImageView mapshowid; // Value injected by FXMLLoader

    @FXML // fx:id="menueditid"
    private Menu menueditid; // Value injected by FXMLLoader

    @FXML // fx:id="menufileid"
    private Menu menufileid; // Value injected by FXMLLoader

    @FXML // fx:id="menuhelpid"
    private Menu menuhelpid; // Value injected by FXMLLoader

    @FXML // fx:id="menuid"
    private MenuBar menuid; // Value injected by FXMLLoader

    @FXML // fx:id="menuitemabtid"
    private MenuItem menuitemabtid; // Value injected by FXMLLoader

    @FXML // fx:id="menuitemdeleteid"
    private MenuItem menuitemdeleteid; // Value injected by FXMLLoader

    @FXML // fx:id="menuitemfilecloseid"
    private MenuItem menuitemfilecloseid; // Value injected by FXMLLoader

    @FXML // fx:id="menuitmfilenewid"
    private MenuItem menuitmfilenewid; // Value injected by FXMLLoader

    @FXML // fx:id="menuitmfilesaveid"
    private MenuItem menuitmfilesaveid; // Value injected by FXMLLoader

    @FXML // fx:id="middleid"
    private TextField middleid; // Value injected by FXMLLoader

    @FXML // fx:id="mmchkid"
    private ComboBox<?> mmchkid; // Value injected by FXMLLoader

    @FXML // fx:id="newscrollid"
    private ScrollBar newscrollid; // Value injected by FXMLLoader

    @FXML // fx:id="newtabid"
    private Tab newtabid; // Value injected by FXMLLoader

    @FXML // fx:id="nicktxtid"
    private TextField nicktxtid; // Value injected by FXMLLoader

    @FXML // fx:id="phnchoiceid"
    private ChoiceBox<?> phnchoiceid; // Value injected by FXMLLoader

    @FXML // fx:id="phnlblid"
    private Label phnlblid; // Value injected by FXMLLoader

    @FXML // fx:id="phntxtid"
    private TextField phntxtid; // Value injected by FXMLLoader

    @FXML // fx:id="pinid"
    private TextField pinid; // Value injected by FXMLLoader

    @FXML // fx:id="savebtnid"
    private Button savebtnid; // Value injected by FXMLLoader

    @FXML // fx:id="searchid"
    private TextField searchid; // Value injected by FXMLLoader

    @FXML // fx:id="showimageid"
    private ImageView showimageid; // Value injected by FXMLLoader

    @FXML // fx:id="stateid"
    private TextField stateid; // Value injected by FXMLLoader

    @FXML // fx:id="streetid"
    private TextField streetid; // Value injected by FXMLLoader

    @FXML // fx:id="wbid"
    private Label wbid; // Value injected by FXMLLoader

    @FXML // fx:id="webaddbtn"
    private Button webaddbtn; // Value injected by FXMLLoader

    @FXML // fx:id="webchid"
    private ChoiceBox<?> webchid; // Value injected by FXMLLoader

    @FXML // fx:id="webtxtid"
    private TextField webtxtid; // Value injected by FXMLLoader

    @FXML // fx:id="ychkid"
    private ComboBox<?> ychkid; // Value injected by FXMLLoader


    // Handler for Button[fx:id="savebtnid"] onMouseClicked
    @FXML
    void handle(MouseEvent event) {
        // handle the event here
        
          try{		
                
                                MongoClient m = new MongoClient();
				BasicDBObject doc = new BasicDBObject();
				BasicDBObject docname = new BasicDBObject();
				BasicDBObject docaddr = new BasicDBObject();
				BasicDBObject docphone = new BasicDBObject();
                                BasicDBObject docemail = new BasicDBObject();
                                BasicDBObject docweb = new BasicDBObject();
				BasicDBObject docaddr1 = new BasicDBObject();
                                BasicDBObject docbd = new BasicDBObject();
                                DB db = m.getDB( "addressbook" );
				DBCollection coll = db.getCollection("person");		
				String tfns = firstid.getText();
				String tmns = middleid.getText();
				String tlns = lastid.getText();
                        	String tnks = nicktxtid.getText();
                        	String tphn = phntxtid.getText();
                                String temail = emailtxtid.getText();
				String tweb = webtxtid.getText();
			        String thsn = housenoid.getText();
				String tstrt = streetid.getText();
				String tcity = cityid.getText();
				String tstate = stateid.getText();
				String tcountry = countryid.getText();
				String tpin = pinid.getText();
				String tphnch = (String)phnchoiceid.getSelectionModel().getSelectedItem();
				String temlch = (String)addemlchid.getSelectionModel().getSelectedItem();
                                String twebch = (String)webchid.getSelectionModel().getSelectedItem();
                                String taddrch = (String)addrchid.getSelectionModel().getSelectedItem();
                                String tdaych = (String)daychkid.getSelectionModel().getSelectedItem();
                                String tmonthch = (String)mmchkid.getSelectionModel().getSelectedItem();
                                String tyearch = (String)ychkid.getSelectionModel().getSelectedItem();
                                if(tfns.isEmpty())
				{}
				else
				{	
				docname.put("First", tfns);
				}
				if(tmns.isEmpty())
				{}
				else
				{	
				docname.put("Middle", tmns);
				}
				if(tlns.isEmpty())
				{}
				else
				{	
				docname.put("Last", tlns);
				}
				if(tnks.isEmpty())
				{}
				else
				{	
				docname.put("Nickname", tnks);
				}
                               
                                doc.put("Name",docname);
				
				if(tphn.isEmpty())
				{}
				else
				{	
				docphone.put(tphnch, tphn);
				}
				
                                doc.put("Phone",docphone);
                               
                                if(temail.isEmpty())
                                {}
                                else
                                {
                                 docemail.put(temlch,temail);   
                                }
                                doc.put("Email",docemail);
                                
                                if(temail.isEmpty())
                                {}
                                else
                                {
                                 docemail.put(temlch,temail);   
                                }
                                doc.put("Email",docemail);
                                
                                if(tweb.isEmpty())
                                {}
                                else
                                {
                                    docweb.put(twebch,tweb);
                                }
                                
                                doc.put("Website",docweb);
                                
                                
                                if(thsn.isEmpty())
                                {}
                                else
                                {
                                    docaddr.put("House No",thsn);
                                }
                                 if(thsn.isEmpty())
                                {}
                                else
                                {
                                    docaddr.put("Street",tstrt);
                                }
                                 if(thsn.isEmpty())
                                {}
                                else
                                {
                                    docaddr.put("City",tcity);
                                }
                                 if(thsn.isEmpty())
                                {}
                                else
                                {
                                    docaddr.put("State",tstate);
                                }
                                 if(thsn.isEmpty())
                                {}
                                else
                                {
                                    docaddr.put("Country",tcountry);
                                }
                                
                                  if(thsn.isEmpty())
                                {}
                                else
                                {
                                    docaddr.put("Pincode",tpin);
                                }
                                
                                  docaddr1.put(taddrch,docaddr);
                                  
                                  doc.put("Address",docaddr1);
                                  
                                  docbd.put("Day",tdaych);
                                  docbd.put("Month",tmonthch);
                                  docbd.put("Year",tyearch);
                                  doc.put("Birthday",docbd);
                                
				coll.insert(doc);
				
				
	}catch(UnknownHostException uh)
	{
		System.out.println(uh);
        }
   
     System.out.println("Save Button Pressed");   
     
                 
        
        
        
    }

    // Handler for Button[fx:id="adddtlid"] onAction
    // Handler for Button[fx:id="adddtlid"] onMouseClicked
    // Handler for Button[fx:id="addemlid"] onAction
    // Handler for Button[fx:id="deletecontactid"] onAction
    // Handler for Button[fx:id="savebtnid"] onAction
    // Handler for Button[fx:id="webaddbtn"] onAction
    // Handler for ComboBox[fx:id="daychkid"] onAction
    // Handler for ImageView[fx:id="imageinsertid"] onMouseClicked
    // Handler for ListView[fx:id="listviewid"] onEditStart
    // Handler for ListView[fx:id="listviewid"] onKeyPressed
    // Handler for ListView[fx:id="listviewid"] onKeyReleased
    // Handler for ListView[fx:id="listviewid"] onKeyTyped
    // Handler for ListView[fx:id="listviewid"] onMouseClicked
    // Handler for ListView[fx:id="listviewid"] onMouseDragged
    // Handler for ListView[fx:id="listviewid"] onMousePressed
    // Handler for MenuItem[fx:id="editdeleteid"] onAction
    // Handler for MenuItem[fx:id="menuitemabtid"] onAction
    // Handler for MenuItem[fx:id="menuitemdeleteid"] onAction
    // Handler for MenuItem[fx:id="menuitemfilecloseid"] onAction
    // Handler for MenuItem[fx:id="menuitmfilenewid"] onAction
    // Handler for MenuItem[fx:id="menuitmfilesaveid"] onAction
    // Handler for Menu[fx:id="menueditid"] onAction
    // Handler for Menu[fx:id="menuhelpid"] onAction
    @FXML
    void handleButtonAction(Event event) {
        // handle the event here
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert adddtlid != null : "fx:id=\"adddtlid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert addemlchid != null : "fx:id=\"addemlchid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert addemlid != null : "fx:id=\"addemlid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert addphnid != null : "fx:id=\"addphnid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert addraddid != null : "fx:id=\"addraddid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert addrchid != null : "fx:id=\"addrchid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert addrlblid != null : "fx:id=\"addrlblid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert bdlblid != null : "fx:id=\"bdlblid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert cityid != null : "fx:id=\"cityid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert contactscrollid != null : "fx:id=\"contactscrollid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert countryid != null : "fx:id=\"countryid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert daychkid != null : "fx:id=\"daychkid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert deletecontactid != null : "fx:id=\"deletecontactid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert editdeleteid != null : "fx:id=\"editdeleteid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert emailtxtid != null : "fx:id=\"emailtxtid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert emllblid != null : "fx:id=\"emllblid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert firstid != null : "fx:id=\"firstid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert homescrollid != null : "fx:id=\"homescrollid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert hometabeid != null : "fx:id=\"hometabeid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert housenoid != null : "fx:id=\"housenoid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert imageinsertid != null : "fx:id=\"imageinsertid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert label != null : "fx:id=\"label\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert lastid != null : "fx:id=\"lastid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert listviewid != null : "fx:id=\"listviewid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert mapshowid != null : "fx:id=\"mapshowid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert menueditid != null : "fx:id=\"menueditid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert menufileid != null : "fx:id=\"menufileid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert menuhelpid != null : "fx:id=\"menuhelpid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert menuid != null : "fx:id=\"menuid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert menuitemabtid != null : "fx:id=\"menuitemabtid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert menuitemdeleteid != null : "fx:id=\"menuitemdeleteid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert menuitemfilecloseid != null : "fx:id=\"menuitemfilecloseid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert menuitmfilenewid != null : "fx:id=\"menuitmfilenewid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert menuitmfilesaveid != null : "fx:id=\"menuitmfilesaveid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert middleid != null : "fx:id=\"middleid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert mmchkid != null : "fx:id=\"mmchkid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert newscrollid != null : "fx:id=\"newscrollid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert newtabid != null : "fx:id=\"newtabid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert nicktxtid != null : "fx:id=\"nicktxtid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert phnchoiceid != null : "fx:id=\"phnchoiceid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert phnlblid != null : "fx:id=\"phnlblid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert phntxtid != null : "fx:id=\"phntxtid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert pinid != null : "fx:id=\"pinid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert savebtnid != null : "fx:id=\"savebtnid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert searchid != null : "fx:id=\"searchid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert showimageid != null : "fx:id=\"showimageid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert stateid != null : "fx:id=\"stateid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert streetid != null : "fx:id=\"streetid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert wbid != null : "fx:id=\"wbid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert webaddbtn != null : "fx:id=\"webaddbtn\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert webchid != null : "fx:id=\"webchid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert webtxtid != null : "fx:id=\"webtxtid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";
        assert ychkid != null : "fx:id=\"ychkid\" was not injected: check your FXML file 'AddressbookGUI.fxml'.";

        // Initialize your logic here: all @FXML variables will have been injected

    }

}
