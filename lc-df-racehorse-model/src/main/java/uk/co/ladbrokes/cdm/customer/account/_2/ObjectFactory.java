//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.customer.account._2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.co.ladbrokes.cdm.customer.account._2 package. 
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

    private final static QName _GamesAccount_QNAME = new QName("http://cdm.ladbrokes.co.uk/customer/Account/2.0", "GamesAccount");
    private final static QName _AccountType_QNAME = new QName("http://cdm.ladbrokes.co.uk/customer/Account/2.0", "AccountType");
    private final static QName _PokerAccount_QNAME = new QName("http://cdm.ladbrokes.co.uk/customer/Account/2.0", "PokerAccount");
    private final static QName _LoyaltyAccount_QNAME = new QName("http://cdm.ladbrokes.co.uk/customer/Account/2.0", "LoyaltyAccount");
    private final static QName _SportsbookAccount_QNAME = new QName("http://cdm.ladbrokes.co.uk/customer/Account/2.0", "SportsbookAccount");
    private final static QName _LiveCasinoAccount_QNAME = new QName("http://cdm.ladbrokes.co.uk/customer/Account/2.0", "LiveCasinoAccount");
    private final static QName _FinancialsAccount_QNAME = new QName("http://cdm.ladbrokes.co.uk/customer/Account/2.0", "FinancialsAccount");
    private final static QName _Account_QNAME = new QName("http://cdm.ladbrokes.co.uk/customer/Account/2.0", "Account");
    private final static QName _AccountCharacteristic_QNAME = new QName("http://cdm.ladbrokes.co.uk/customer/Account/2.0", "AccountCharacteristic");
    private final static QName _LottosAccount_QNAME = new QName("http://cdm.ladbrokes.co.uk/customer/Account/2.0", "LottosAccount");
    private final static QName _CRMAccount_QNAME = new QName("http://cdm.ladbrokes.co.uk/customer/Account/2.0", "CRMAccount");
    private final static QName _CasinoAccount_QNAME = new QName("http://cdm.ladbrokes.co.uk/customer/Account/2.0", "CasinoAccount");
    private final static QName _SystemAccount_QNAME = new QName("http://cdm.ladbrokes.co.uk/customer/Account/2.0", "SystemAccount");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.co.ladbrokes.cdm.customer.account._2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GamesAccount }
     * 
     */
    public GamesAccount createGamesAccount() {
        return new GamesAccount();
    }

    /**
     * Create an instance of {@link AccountType }
     * 
     */
    public AccountType createAccountType() {
        return new AccountType();
    }

    /**
     * Create an instance of {@link PokerAccount }
     * 
     */
    public PokerAccount createPokerAccount() {
        return new PokerAccount();
    }

    /**
     * Create an instance of {@link LoyaltyAccount }
     * 
     */
    public LoyaltyAccount createLoyaltyAccount() {
        return new LoyaltyAccount();
    }

    /**
     * Create an instance of {@link SportsbookAccount }
     * 
     */
    public SportsbookAccount createSportsbookAccount() {
        return new SportsbookAccount();
    }

    /**
     * Create an instance of {@link LiveCasinoAccount }
     * 
     */
    public LiveCasinoAccount createLiveCasinoAccount() {
        return new LiveCasinoAccount();
    }

    /**
     * Create an instance of {@link FinancialsAccount }
     * 
     */
    public FinancialsAccount createFinancialsAccount() {
        return new FinancialsAccount();
    }

    /**
     * Create an instance of {@link AccountCharacteristic }
     * 
     */
    public AccountCharacteristic createAccountCharacteristic() {
        return new AccountCharacteristic();
    }

    /**
     * Create an instance of {@link LottosAccount }
     * 
     */
    public LottosAccount createLottosAccount() {
        return new LottosAccount();
    }

    /**
     * Create an instance of {@link CRMAccount }
     * 
     */
    public CRMAccount createCRMAccount() {
        return new CRMAccount();
    }

    /**
     * Create an instance of {@link CasinoAccount }
     * 
     */
    public CasinoAccount createCasinoAccount() {
        return new CasinoAccount();
    }

    /**
     * Create an instance of {@link SystemAccount }
     * 
     */
    public SystemAccount createSystemAccount() {
        return new SystemAccount();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GamesAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/customer/Account/2.0", name = "GamesAccount")
    public JAXBElement<GamesAccount> createGamesAccount(GamesAccount value) {
        return new JAXBElement<GamesAccount>(_GamesAccount_QNAME, GamesAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/customer/Account/2.0", name = "AccountType")
    public JAXBElement<AccountType> createAccountType(AccountType value) {
        return new JAXBElement<AccountType>(_AccountType_QNAME, AccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PokerAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/customer/Account/2.0", name = "PokerAccount")
    public JAXBElement<PokerAccount> createPokerAccount(PokerAccount value) {
        return new JAXBElement<PokerAccount>(_PokerAccount_QNAME, PokerAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoyaltyAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/customer/Account/2.0", name = "LoyaltyAccount")
    public JAXBElement<LoyaltyAccount> createLoyaltyAccount(LoyaltyAccount value) {
        return new JAXBElement<LoyaltyAccount>(_LoyaltyAccount_QNAME, LoyaltyAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SportsbookAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/customer/Account/2.0", name = "SportsbookAccount")
    public JAXBElement<SportsbookAccount> createSportsbookAccount(SportsbookAccount value) {
        return new JAXBElement<SportsbookAccount>(_SportsbookAccount_QNAME, SportsbookAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LiveCasinoAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/customer/Account/2.0", name = "LiveCasinoAccount")
    public JAXBElement<LiveCasinoAccount> createLiveCasinoAccount(LiveCasinoAccount value) {
        return new JAXBElement<LiveCasinoAccount>(_LiveCasinoAccount_QNAME, LiveCasinoAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialsAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/customer/Account/2.0", name = "FinancialsAccount")
    public JAXBElement<FinancialsAccount> createFinancialsAccount(FinancialsAccount value) {
        return new JAXBElement<FinancialsAccount>(_FinancialsAccount_QNAME, FinancialsAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/customer/Account/2.0", name = "Account")
    public JAXBElement<Account> createAccount(Account value) {
        return new JAXBElement<Account>(_Account_QNAME, Account.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountCharacteristic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/customer/Account/2.0", name = "AccountCharacteristic")
    public JAXBElement<AccountCharacteristic> createAccountCharacteristic(AccountCharacteristic value) {
        return new JAXBElement<AccountCharacteristic>(_AccountCharacteristic_QNAME, AccountCharacteristic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LottosAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/customer/Account/2.0", name = "LottosAccount")
    public JAXBElement<LottosAccount> createLottosAccount(LottosAccount value) {
        return new JAXBElement<LottosAccount>(_LottosAccount_QNAME, LottosAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRMAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/customer/Account/2.0", name = "CRMAccount")
    public JAXBElement<CRMAccount> createCRMAccount(CRMAccount value) {
        return new JAXBElement<CRMAccount>(_CRMAccount_QNAME, CRMAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CasinoAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/customer/Account/2.0", name = "CasinoAccount")
    public JAXBElement<CasinoAccount> createCasinoAccount(CasinoAccount value) {
        return new JAXBElement<CasinoAccount>(_CasinoAccount_QNAME, CasinoAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/customer/Account/2.0", name = "SystemAccount")
    public JAXBElement<SystemAccount> createSystemAccount(SystemAccount value) {
        return new JAXBElement<SystemAccount>(_SystemAccount_QNAME, SystemAccount.class, null, value);
    }

}
