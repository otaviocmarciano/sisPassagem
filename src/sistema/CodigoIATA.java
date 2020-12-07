package sistema;
/**
 * 
 * Codigos IATA que podem ser usados
 *
 */
public enum CodigoIATA {
    SBAM("Amapï¿½/AP", 0, 0),
    SWYN("Apuï¿½/AM", 0, 0),
    APQ("Arapiraca/AL", 0, 0),
    BAZ("Barcelos/AM", 0, 0),
    SWBI("Barreirinha/AM", 0, 0),
    BEL("Belï¿½m/PA", 0, 0),
    CNF("Confins/MG", 0, 0),
    PLU("Belo Horizonte/MG", 0, 0),
    SWBR("Borba/AM", 0, 0),
    SWBS("Brasileia/AC", 0, 0),
    BSB("Lago Sul/DF", 0, 0),
    SNCC("Calï¿½oene/AP", 0, 0),
    VCP("Campinas/SP", 0, 0),
    CPQ("Campinas/SP", 0, 0),
    SBMT("Sï¿½o Paulo/SP", 0, 0),
    CAU("Caruaru/PE", 0, 0),
    CAF("Caraurari/AM", 0, 0),
    CAC("Cascavel/PR", 0, 0),
    SILQ("Cascavel/PR", 0, 0),
    CIZ("Coari/AM", 0, 0),
    CDJ("Conceiï¿½ï¿½o do Araguaia/PA", 0, 0),
    CZS("Cruzeiro do Sul/AC", 0, 0),
    BFH("Curitiba/PR", 0, 0),
    CWB("Sï¿½o Josï¿½ dos Pinhais/PR", 0, 0),
    FEJ("Feijï¿½/AC", 0, 0),
    SWFN("Manaus/AM", 0, 0),
    FLN("Florianï¿½pilis/SC", 0, 0),
    FOR("Fortaleza/CE", 0, 0),
    IGU("Foz do Iguaï¿½ï¿½/PR", 0, 0),
    IZA("Goianï¿½/MG ", 0, 0),
    GYN("Goiï¿½nia/GO", -16.6799, -49.255),
    GRU("Guarulhos/SP", -23.413, -46.4445),
    IMP("Imperatriz/MA", 0, 0),
    JJD("Cruz/CE", 0, 0),
    JOI("Joinville/SC", 0, 0),
    JPA("Bayeux/PB", 0, 0),
    JDF("Juiz de Fora/MG", 0, 0),
    QDV("Jundiaï¿½/SP", 0, 0),
    MCP("Macapï¿½/AP", 0, 0),
    MAO("Manaus/AM", 0, 0),
    SNML("Rio Largo/A L", 0, 0),
    MCZ("Rio Largo/AL", 0, 0),
    MVF("Mossorï¿½/RN", 0, 0),
    NVT("Navegantes/SC", 0, 0),
    NAT("Sï¿½o Gonï¿½alo do Amarante/RN", 0, 0),
    SWNK("Boca do Acre/AM", 0, 0),
    SBOI("Oiapoque/AP", 0, 0),
    SNOZ("Paï¿½o do Lumiar/MA", 0, 0),
    SWJV("Atalaia do Norte/AM", 0, 0),
    PHB("Parnaï¿½ba/PI", 0, 0),
    SNPE("Penedo/AL", 0, 0),
    PGZ("Ponta Grossa/PR", 0, 0),
    POA("Porto Alegre/RS", 0, 0),
    SNPG("Porto Grande/AP", 0, 0),
    REC("Recife/PE", 0, 0),
    RAO("Ribeirï¿½o Preto/SP", 0, 0),
    RBR("Rio Branco/AC", 0, 0),
    SDU("Rio de Janeiro/RJ", 0, 0),
    GIG("Rio de Janeiro/RJ", 0, 0),
    SBJR("Rio de Janeiro/RJ", 0, 0),
    ROO("Rondonï¿½polis/MT", 0, 0),
    RIA("Santa Maria/RS", 0, 0),
    SDOE("Santa Rosa do Purus/AC", 0, 0),
    SSZ("Guarujï¿½/SP", 0, 0),
    QSC("Sï¿½o Carlos/SP", 0, 0),
    SLZ("Sï¿½o Luï¿½s/MA", 0, 0),
    CGH("Sï¿½o Paulo/SP", 0, 0),
    ZMD("Sena Madureira/AC", -9.06721, -68.6577),
    SOD("Sorocaba/SP", -23.5062, -47.45590),
    SWMU("Pacaraima/RR", 0, 0),
    TBT("Tabatinga/AM", 0, 0),
    TRQ("Taraucï¿½/AC", 0, 0),
    TFF("Tefï¿½/AM", 0, 0),
    THE("Teresina/PI", 0, 0),
    SBTS("ï¿½bidos/PA", 0, 0),
    SNUN("Unaï¿½/MG", 0, 0),
    SWXU("Xapuri/AC", 0, 0);

    private final String cidade;
    private final double latitude;
    private final double longitude;

    /**
     * Construtor que inicializa um objeto CodigoIATA a partir dos parâmetros cidade, latitude e longitude.
     * 
     */
    CodigoIATA(String cidade, double latitude, double longitude) {
        this.cidade = cidade;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getCidade() {
        return cidade;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

}
