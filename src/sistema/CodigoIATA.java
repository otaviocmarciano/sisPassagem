package sistema;
/**
 * 
 * Codigos IATA que podem ser usados
 *
 */
public enum CodigoIATA {
    SBAM("Amapá/AP", 2.05108, -50.7945),
    SWYN("Apuí/AM", -7.172871, -59.839577),
    APQ("Arapiraca/AL", -9.75164, -36.6604),
    BAZ("Barcelos/AM", -0.975339, -62.9245),
    SWBI("Barreirinha/AM", -2.792424, -57.057910),
    BEL("Belém/PA", -1.45502, -48.5024),
    CNF("Confins/MG", -19.631, -43.9902),
    PLU("Belo Horizonte/MG", -19.8157, -43.9542),
    SWBR("Borba/AM", -4.38835, -59.5945),
    SWBS("Brasileia/AC", -11.0069, -68.7426),
    BSB("Lago Sul/DF", -15.7801, -47.9292),
    SNCC("Calçoene/AP", 2.514722, -50.952221),
    VCP("Campinas/SP", -23.008200, -47.137600),
    CPQ("Campinas/SP", -22.863400, -47.105200),
    SBMT("São Paulo/SP", -23.506944, -46.634167),
    CAU("Caruaru/PE", -8.28139, -35.9735),
    CAF("Caraurari/AM", -4.87907, -66.9001),
    CAC("Cascavel/PR", -25.0008, -53.5020),
    SILQ("Cascavel/PR", -24.926667, -53.498333),
    CIZ("Coari/AM", -4.08488, -63.1417),
    CDJ("Conceição do Araguaia/PA", -8.348346, -8.348346),
    CZS("Cruzeiro do Sul/AC", -8.25811, -49.2696),
    BFH("Curitiba/PR", -25.4284, -49.2733),
    CWB("São José dos Pinhais/PR", -25.5307, -49.1958),
    FEJ("Feijó/AC", -8.17065, -70.3582),
    SWFN("Manaus/AM", -3.072778, -60.021111),
    FLN("Florianópilis/SC", -27.5969, -48.5495),
    FOR("Fortaleza/CE", -3.71839, -38.5434),
    IGU("Foz do Iguaçú/PR", -25.5469, -54.5882),
    IZA("Goianá/MG ", -21.5406, -43.1983),
    GYN("Goiânia/GO", -16.6799, -49.255),
    GRU("Guarulhos/SP", -23.413, -46.4445),
    IMP("Imperatriz/MA", -5.5255, -47.4775),
    JJD("Cruz/CE", -2.91941, -40.1703),
    JOI("Joinville/SC", -26.3051, -48.8461),
    JPA("Bayeux/PB", -7.12499, -34.9321),
    JDF("Juiz de Fora/MG", -21.7642, -43.3496),
    QDV("Jundiaí/SP", -23.1865, -46.8845),
    MCP("Macapá/AP", 0.0344566, -51.0666),
    MAO("Manaus/AM", -3.10719, -60.0261),
    SNML("Rio Largo/AL", -9.544444, -35.829444),
    MCZ("Rio Largo/AL", -9.4802, -35.858),
    MVF("Mossoró/RN", -5.18804, -37.3441),
    NVT("Navegantes/SC", -26.8994, -48.6553),
    NAT("São Gonçalo do Amarante/RN", -3.60733, -38.9705),
    SWNK("Boca do Acre/AM", -8.833611, -67.312222),
    SBOI("Oiapoque/AP", 3.861389, -51.796111),
    SNOZ("Paço do Lumiar/MA", -2.53054, -44.1052),
    SWJV("Atalaia do Norte/AM", -5.127238, -72.809985),
    PHB("Parnaíba/PI", -2.90393, -41.7763),
    SNPE("Penedo/AL", -10.2874, -36.5824),
    PGZ("Ponta Grossa/PR", -25.0945, -50.1633),
    POA("Porto Alegre/RS", -30.0277, -51.2287),
    SNPG("Porto Grande/AP", 0.704386, -51.4096),
    REC("Recife/PE", -8.05428, -34.8813),
    RAO("Ribeirão Preto/SP", -21.1767, -47.8208),
    RBR("Rio Branco/AC", -9.974, -67.8076),
    SDU("Rio de Janeiro/RJ", -22.9111, -43.1649),
    GIG("Rio de Janeiro/RJ", -22.8053, -43.2566),
    SBJR("Rio de Janeiro/RJ", -22.98750, -43.370000),
    ROO("Rondonópolis/MT", -16.4713, -54.6371),
    RIA("Santa Maria/RS", -29.6914, -53.8008),
    SDOE("Santa Rosa do Purus/AC", -9.43336, -70.4935),
    SSZ("Guarujá/SP", -23.9946, -46.2569),
    QSC("São Carlos/SP", -22.0154, -47.8911),
    SLZ("São Luís/MA", -2.53073, -44.3068),
    CGH("São Paulo/SP", -23.6273, -46.6566),
    ZMD("Sena Madureira/AC", -9.06721, -68.6577),
    SOD("Sorocaba/SP", -23.5062, -47.45590),
    SWMU("Pacaraima/RR", 4.3163898, -60.700555),
    TBT("Tabatinga/AM", -4.25335, -69.9385),
    TRQ("Taraucá/AC", -8.13562, -70.765),
    TFF("Tefé/AM", -3.32073, -64.7236),
    THE("Teresina/PI", -5.08921, -42.8016),
    SBTS("Óbidos/PA", 2.223472, -55.946055),
    SNUN("Unaí/MG", -16.356474, -46.927713),
    SWXU("Xapuri/AC", -10.6638710, -68.485757);

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
