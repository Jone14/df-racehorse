//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.trading.participant._2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.co.ladbrokes.cdm.trading.participant._2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Participant_QNAME = new QName("http://cdm.ladbrokes.co.uk/trading/Participant/2.0", "Participant");
    private final static QName _ParticipantType_QNAME = new QName("http://cdm.ladbrokes.co.uk/trading/Participant/2.0", "ParticipantType");
    private final static QName _Player_QNAME = new QName("http://cdm.ladbrokes.co.uk/trading/Participant/2.0", "Player");
    private final static QName _PlayerNote_QNAME = new QName("http://cdm.ladbrokes.co.uk/trading/Participant/2.0", "PlayerNote");
    private final static QName _Team_QNAME = new QName("http://cdm.ladbrokes.co.uk/trading/Participant/2.0", "Team");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.co.ladbrokes.cdm.trading.participant._2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Participant }
     * 
     */
    public Participant createParticipant() {
        return new Participant();
    }

    /**
     * Create an instance of {@link ParticipantType }
     * 
     */
    public ParticipantType createParticipantType() {
        return new ParticipantType();
    }

    /**
     * Create an instance of {@link Player }
     * 
     */
    public Player createPlayer() {
        return new Player();
    }

    /**
     * Create an instance of {@link PlayerNote }
     * 
     */
    public PlayerNote createPlayerNote() {
        return new PlayerNote();
    }

    /**
     * Create an instance of {@link Team }
     * 
     */
    public Team createTeam() {
        return new Team();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Participant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/trading/Participant/2.0", name = "Participant")
    public JAXBElement<Participant> createParticipant(Participant value) {
        return new JAXBElement<Participant>(_Participant_QNAME, Participant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParticipantType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/trading/Participant/2.0", name = "ParticipantType")
    public JAXBElement<ParticipantType> createParticipantType(ParticipantType value) {
        return new JAXBElement<ParticipantType>(_ParticipantType_QNAME, ParticipantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Player }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/trading/Participant/2.0", name = "Player")
    public JAXBElement<Player> createPlayer(Player value) {
        return new JAXBElement<Player>(_Player_QNAME, Player.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlayerNote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/trading/Participant/2.0", name = "PlayerNote")
    public JAXBElement<PlayerNote> createPlayerNote(PlayerNote value) {
        return new JAXBElement<PlayerNote>(_PlayerNote_QNAME, PlayerNote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Team }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/trading/Participant/2.0", name = "Team")
    public JAXBElement<Team> createTeam(Team value) {
        return new JAXBElement<Team>(_Team_QNAME, Team.class, null, value);
    }

}
