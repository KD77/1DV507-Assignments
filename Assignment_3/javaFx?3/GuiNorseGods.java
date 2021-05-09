package One;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class GuiNorseGods extends Application {
 final NorseGods []gd=new NorseGods[] {
			        new NorseGods("Odin",
					        "is a widely revered _ in Germanic mythology. In Norse mythology."
							+ "from which stems most surviving information about the __,\n "
					        +"\n"
							+ "Odin is associated with wisdom, healing, death, royalty, the gallows, "
							+ "knowledge, war, battle, victory, sorcery, poetry, frenzy,\n and the runic alphabet, "
							+ "and is the husband of the goddess Frigg. In wider Germanic mythology and paganism, "
							+ "the __ was known in Old English as Wōden,\n in Old Saxon as Wōdan, and in Old High "
							+ "German as Wuotan or Wōtan, all stemming from the reconstructed Proto-Germanic theonym *wōđanaz.\n"
							+ "Odin is a prominently mentioned __ throughout the recorded history of the Germanic peoples,"
							+ " from the Roman occupation of regions of \n Germania through the tribal expansions of the Migration"
							+ " Period and the Viking Age.\n In the modern period, Odin continued to be acknowledged in the rural "
							+ "folklore of Germanic Europe. \n References to Odin appear in place names throughout regions historically"
							+ " inhabited by the ancient Germanic peoples,\n and the day of the week Wednesday bears his name in many Germanic",
					          " Óðinn"),
			        new NorseGods("Thor",
					          "is a hammer-wielding __ associated with thunder, lightning, storms, oak trees, strength,\n"
							+ "the protection of mankind and also hallowing and fertility. Besides Old Norse Þórr,\n"
							+ "extensions of the god occur in Old English as Þunor and in Old High German as Donar .\n"
							+ "All forms of the deity stem from a Common Germanic *Þunraz (meaning thunder).\n"
							+ "Thor is a prominently mentioned god throughout the recorded history of the Germanic peoples,\n"
							+ "from the Roman occupation of regions of Germania, to the tribal expansions of the Migration Period,\n"
							+ "to his high popularity during the Viking Age, when, in the face of the process of the Christianization of Scandinavia,\n"
							+ "emblems of his hammer, Mjölnir, were worn and Norse pagan personal names containing the name of the __\n bear witness"
							+ "to his popularity. is a hammer-wielding god associated with thunder, lightning, storms, oak trees, strength,\n"
							+ "the protection of mankind and also hallowing and fertility.\n Besides Old Norse Þórr,"
							+ "extensions of the _ occur in Old English as Þunor and in Old High German as Donar ",
					          "(runic þonar ᚦᛟᚾᚨᚱ)."),
			        
			        new NorseGods("Baldr",
			        		" is a __ in Norse mythology, and a son of the __ Odin and the goddess Frigg.\n"
			        		+"He has numerous brothers, such as Thor and Váli. In the 12th century,\n"
			        		+ " Danish accounts by Saxo Grammaticus andother Danish Latin chroniclers\n"
			        		+ " recorded a euhemerized account of his story. Compiled in Iceland in the 13th century,\n"
			        		+ " but based on much older Old Norse poetry, the Poetic Edda and the Prose Edda contain numerous\n "
			        		+ "references to the death of Baldr as both a great tragedy to the Æsir and ",
			        		"a harbinger of Ragnarök."),
			        new NorseGods("Freyr",
			                " is a widely attested __ associated with sacral kingship, virility and prosperity, with sunshine and fair weather,\n"
			                + " and pictured as a phallic fertility god in Norse mythology. Freyr is said to \"bestow peace and pleasure on mortals\".\n"
			                + " Freyr, sometimes referred to as Yngvi-Freyr, was especially associated with \n "
			                + "Sweden and seen as an ancestor of the Swedish royal house.","Vanir"),
			        new NorseGods("Freyr",
			        		"Freyr (Old Norse: Lord), sometimes anglicized as Frey, is a widely attested god associated with sacral kingship,\n"
			        		+ " virility and prosperity, with sunshine and fair weather, and pictured as a phallic fertility god in Norse mythology.\n"
			        		+ " Freyr is said to \"bestow peace and pleasure on mortals\". Freyr, sometimes referred to as Yngvi-Freyr, was especially\n"
			        		+ " associated with Sweden and seen as an ancestor of the Swedish royal house.\n" + 
			        		"\n" + 
			        		"In the Icelandic books the Poetic Edda and the Prose Edda, Freyr is presented as one of the Vanir, the son of the sea god Njörðr,\n"
			        		+ " as well as the twin brother of the goddess Freyja. The gods gave him Álfheimr, the realm of the Elves, as a teething present.\n"
			        		+ " He rides the shining dwarf-made boar Gullinbursti and possesses the ship Skíðblaðnir which always has a favorable breeze\n"
			        		+ " and can be folded together and carried in a pouch when it is not being used.\n"
			        		+ " Freyr is also known to have been associated with the horse cult. He also kept sacred horses in his sanctuary at Thrandheim in Norway.\n"
			        		+ " He has the servants Skírnir, Byggvir and Beyla.\n" 
			        	
			        		+"The most extensive surviving Freyr myth relates Freyr's falling in love with the female jötunn Gerðr.\n"
			        		+ " Eventually, she becomes his wife but first Freyr has to give away his sword which fights on its own \"if wise be he who wields it.\"\n"
			        		+ " Although deprived of this weapon, Freyr defeats the jötunn Beli with an antler.\n"
			        		+ " However, lacking his sword, Freyr will be killed by the fire jötunn Surtr during the events of Ragnarök.\n"
			        		+ "Like other Germanic deities, veneration of Freyr is revived during the modern period through the Heathenry movement.","(un known )"),
			        new NorseGods("Heimdallr",
			        		"In Norse mythology, Heimdallr is a god who possesses the resounding horn Gjallarhorn,\n"
			        		+ " owns the golden-maned horse Gulltoppr, is called the shining god and the brightest of the__\n"
			        		+ ", has gold teeth, and is the son of Nine Mothers (who may represent personified waves).\n"
			        		+ " Heimdallr is attested as possessing foreknowledge, keen eyesight and hearing,\n"
			        		+ " and keeps watch for invaders and the onset of Ragnarök while drinking fine mead in his dwelling Himinbjörg,\n"
			        		+ " located where the burning rainbow bridge Bifröst meets the sky.\n"
			        		+ "\n"
			        		+ " Heimdallr is said to be the originator of social classes among humanity and once regained Freyja's\n"
			        		+ " treasured possession Brísingamen while doing battle in the shape of a seal with Loki.\n"
			        		+ " Heimdallr and Loki are foretold to kill one another during the events of Ragnarök. \n"
			        		+ "Heimdallr is additionally referred to as Rig, Hallinskiði, Gullintanni, and Vindlér or Vindhlér.\n" + 
			        		"\n" + 
			        		"Heimdallr is attested in the Poetic Edda, compiled in the 13th century from earlier traditional material;\n"
			        		+ " in the Prose Edda and Heimskringla, both written in the 13th century by Snorri Sturluson; in the poetry of skalds;\n"
			        		+ " and on an Old Norse runic inscription found in England. Two lines of an otherwise lost poem about the __\n"
			        		+ ", Heimdalargaldr, survive. Due to the problematic and enigmatic nature of these attestations,\n"
			        		+ " scholars have produced various theories about the nature of the god, including his apparent relation to rams,\n"
			        		+ " that he may be a personification of or connected to the world tree Yggdrasil, and potential Indo-European cognates.","(un known )"),
			        new NorseGods("Bragi",
			        		"Bragi is generally associated with bragr, the Norse word for poetry. The name of the god may have been derived from bragr,\n"
			        		+ " or the term bragr may have been formed to describe 'what Bragi does'. A connection between the name Bragi and Old English brego\n"
			        		+ " 'chieftain' has been suggested but is generally now discounted. \n"
			        		+ "A connection between Bragi and the bragarfull 'promise cup' is sometimes suggested, as bragafull, an alternate form of the word,\n"
			        		+ " might be translated as 'Bragi's cup'.That Bragi is Odin's son is clearly mentioned only here and in some versions\n"
			        		+ " of a list of the sons of Odin (see Sons of Odin). But \"wish-son\" in stanza 16 of the Lokasenna could mean \"Odin's son\" and\n"
			        		+ " is translated by Hollander as Odin's kin. Bragi's mother is possibly the giantess Gunnlod. If Bragi's mother is Frigg,\n"
			        		+ " then Frigg is somewhat dismissive of Bragi in the Lokasenna in stanza 27 when Frigg complains that if she had a son\n"
			        		+ " in Ægir's hall as brave as Baldr then Loki would have to fight for his life.\n" + 
			        		"\n" + 
			        		"In that poem Bragi at first forbids Loki to enter the hall but is overruled by Odin.\n"
			        		+ " Loki then gives a greeting to all gods and goddesses who are in the hall save to Bragi.\n"
			        		+ " Bragi generously offers his sword, horse, and an arm ring as peace gift but Loki only responds by accusing Bragi of cowardice,\n"
			        		+ " of being the most afraid to fight of any of the Æsir and Elves within the hall. Bragi responds that if they were outside the hall,\n"
			        		+ " he would have Loki's head, but Loki only repeats the accusation. When Bragi's wife Iðunn attempts to calm Bragi,\n"
			        		+ " Loki accuses her of embracing her brother's slayer, a reference to matters that have not survived. It may be that Bragi had slain Iðunn's brother.\n" + 
			        		"\n" + 
			        		"A passage in the Poetic Edda poem Sigrdrífumál describes runes being graven on the sun, on the ear of one of the\n"
			        		+ " sun-horses and on the hoofs of the other, on Sleipnir's teeth, on bear's paw, on eagle's beak, on wolf's claw, \n"
			        		+ "and on several other things including on Bragi's tongue. Then the runes are shaved off and the shavings are mixed \n"
			        		+ "with mead and sent abroad so that Æsir have some, Elves have some, Vanir have some, and Men have some, \n"
			        		+ "these being speech runes and birth runes, ale runes, and magic runes. The meaning of this is obscure.\n" + 
			        		"\n" + 
			        		"The first part of Snorri Sturluson's Skáldskaparmál is a dialogue between Ægir and Bragi about the nature of poetry,\n"
			        		+ " particularly skaldic poetry. Bragi tells the origin of the mead of poetry from the blood of Kvasir and\n"
			        		+ " how Odin obtained this mead. He then goes on to discuss various poetic metaphors known as kennings.","(un known )"
			        		),
			        new NorseGods("Tyr",
			        		"In Germanic mythology, Týr (Old Norse ᛏᛁᚢᛦ)[1], Tíw (Old English), and Ziu (Old High German) is a god. \n"
			        		+ "Stemming from the Proto-Germanic deity *Tīwaz and ultimately from the Proto-Indo-European deity *Dyeus, \n"
			        		+ "little information about the god survives beyond Old Norse sources. Due to the etymology of the god's name \n"
			        		+ "and the shadowy presence of the god in the extant Germanic corpus, some scholars propose that Týr may have once \n"
			        		+ "held a more central place among the deities of early Germanic mythology.\n" + 
			        		"\n" + 
			        		"Týr is the namesake of the Tiwaz rune (ᛏ), a letter of the runic alphabet corresponding to the Latin letter T.\n"
			        		+ " By way of the process of interpretatio germanica, the deity is the namesake of Tuesday ('Týr's day') in Germanic languages,\n"
			        		+ " including English. Interpretatio romana, in which Romans interpreted other gods as forms of their own,\n"
			        		+ " generally renders the god as Mars, the ancient Roman war god, and it is through that lens that most Latin references to the __ occur.\n"
			        		+ " For example, the god may be referenced as Mars Thingsus (Latin 'Mars of the Thing') on 3rd century Latin inscription,\n"
			        		+ " reflecting a strong association with the Germanic thing, a legislative body among the ancient Germanic peoples.\n" + 
			        		"\n" + 
			        		"In Norse mythology, from which most surviving narratives about gods among the Germanic peoples stem, \n"
			        		+ "Týr sacrifices his arm to the monstrous wolf Fenrir, who bites off his limb while the gods bind the animal. \n"
			        		+ "Týr is foretold to be consumed by the similarly monstrous dog Garmr during the events of Ragnarök. In Old Norse sources, \n"
			        		+ "Týr is alternately described as the son of the jötunn Hymir (in Hymiskviða) or of the god Odin (in Skáldskaparmál).\n"
			        		+ " Lokasenna makes reference to an unnamed otherwise unknown consort, perhaps also reflected in the continental Germanic record \n"
			        		+ "(see Zisa (goddess)).\n" + 
			        		"\n" + 
			        		"Various place names in Scandinavia refer to the god, and a variety of objects found in England and Scandinavia may depict the god or invoke him.","(un known )"
			        		)

			        
			    };
 
 final String [] viewOptions =new String[] {
	 "Name",
	 "race", 
	 "desc"
	 
 };
 final Label Name= new Label();
 final Label race= new Label();
 final Label description = new Label();
 private int  currentIndex = -1;
			 
	@Override
	public void start(Stage PrimaryStage) throws Exception {
		BorderPane pane=new BorderPane();
		Scene scene=new Scene(pane,1200,500);
		PrimaryStage.setScene(scene);
		
		PrimaryStage.setTitle("Norse Gods");
		PrimaryStage.setResizable(false);
		PrimaryStage.show();
		
		ListView<String>list=new ListView<>();
		list.setPrefWidth(200);
		list.getItems().addAll(
				"Odin",
				"Thor",
				"Baldar",
				"Freyr",
				"Freyja",
				"Heimdallr",
				"Bragi",
				"Tyr");
		
		VBox Layout=new VBox();
		Layout.getChildren().add(list);
		
		pane.setLeft(Layout);
		pane.setPadding(new Insets(5,5,5,5));

		
	
		
		
		
		
		list.getSelectionModel().selectedIndexProperty().addListener(ov -> {
				
			for(Integer i: list.getSelectionModel().getSelectedIndices()) {
				 Name.setText(gd[i].getName());
			 
	        race.setText("(" + gd[i].getDesc()+ ")");
           description.setText(gd[i].getRace());	
			}
			
		
		});
		Name.setFont(new Font("Verdana Bold", 22));
        race.setFont(new Font("Arial Italic", 10));
	    
	        description.setWrapText(true);
	        description.setTextAlignment(TextAlignment.JUSTIFY);
	        
	        final VBox vbox = new VBox();
	       ScrollBar sb = new ScrollBar();
	       sb.setPrefHeight(180);
	        vbox.setSpacing(10);
	        vbox.setPadding(new Insets(0, 10, 0, 10));
	        vbox.getChildren().addAll(Name,race, description);
	       
	        pane.setRight(vbox);
	        pane.setPrefWidth(300);
	
		
	}
	

public static void main(String[] args) {
	
		launch(args);
	}

}
