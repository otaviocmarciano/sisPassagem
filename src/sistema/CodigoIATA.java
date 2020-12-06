
package sistema;

public enum CodigoIATA {
	SBAM("Amapá/AP", 0, 0),
	SWYN("Apuí/AM", 0, 0),
	APQ("Arapiraca/AL", 0, 0),
	BAZ("Barcelos/AM", 0, 0),
	SWBI("Barreirinha/AM", 0, 0),
	BEL("Belém/PA", 0, 0),
	CNF("Confins/MG", 0, 0),
	PLU("Belo Horizonte/MG", 0, 0),
	SWBR("Borba/AM", 0, 0),
	SWBS("Brasileia/AC", 0, 0),
	BSB("Lago Sul/DF", 0, 0),
	SNCC("Calçoene/AP", 0, 0),
	VCP("Campinas/SP", 0, 0),
	CPQ("Campinas/SP", 0, 0),
	SBMT("São Paulo/SP", 0, 0),
	CAU("Caruaru/PE", 0, 0),
	CAF("Caraurari/AM", 0, 0),
	CAC("Cascavel/PR", 0, 0),
	SILQ("Cascavel/PR", 0, 0),
	CIZ("Coari/AM", 0, 0),
	CDJ("Conceição do Araguaia/PA", 0, 0),
	CZS("Cruzeiro do Sul/AC", 0, 0),
	BFH("Curitiba/PR", 0, 0),
	CWB("São José dos Pinhais/PR", 0, 0),
	FEJ("Feijó/AC", 0, 0),
	SWFN("Manaus/AM", 0, 0),
	FLN("Florianópilis/SC", 0, 0),
	FOR("Fortaleza/CE", 0, 0),
	IGU("Foz do Iguaçú/PR", 0, 0),
	IZA("Goianá/MG ", 0, 0),
	GYN("Goiânia/GO", -16.6799, -49.255),
	GRU("Guarulhos/SP", -23.413, -46.4445),
	IMP("Imperatriz/MA", 0, 0),
	JJD("Cruz/CE", 0, 0),
	JOI("Joinville/SC", 0, 0),
	JPA("Bayeux/PB", 0, 0),
	JDF("Juiz de Fora/MG", 0, 0),
	QDV("Jundiaí/SP", 0, 0),
	MCP("Macapá/AP", 0, 0),
	MAO("Manaus/AM", 0, 0),
	SNML("Rio Largo/A L", 0, 0),
	MCZ("Rio Largo/AL", 0, 0),
	MVF("Mossoró/RN", 0, 0),
	NVT("Navegantes/SC", 0, 0),
	NAT("São Gonçalo do Amarante/RN", 0, 0),
	SWNK("Boca do Acre/AM", 0, 0),
	SBOI("Oiapoque/AP", 0, 0),
	SNOZ("Paço do Lumiar/MA", 0, 0),
	SWJV("Atalaia do Norte/AM", 0, 0),
	PHB("Parnaíba/PI", 0, 0),
	SNPE("Penedo/AL", 0, 0),
	PGZ("Ponta Grossa/PR", 0, 0),
	POA("Porto Alegre/RS", 0, 0),
	SNPG("Porto Grande/AP", 0, 0),
	REC("Recife/PE", 0, 0),
	RAO("Ribeirão Preto/SP", 0, 0),
	RBR("Rio Branco/AC", 0, 0),
	SDU("Rio de Janeiro/RJ", 0, 0),
	GIG("Rio de Janeiro/RJ", 0, 0),
	SBJR("Rio de Janeiro/RJ", 0, 0),
	ROO("Rondonópolis/MT", 0, 0),
	RIA("Santa Maria/RS", 0, 0),
	SDOE("Santa Rosa do Purus/AC", 0, 0),
	SSZ("Guarujá/SP", 0, 0),
	QSC("São Carlos/SP", 0, 0),
	SLZ("São Luís/MA", 0, 0),
	CGH("São Paulo/SP", 0, 0),
	ZMD("Sena Madureira/AC", -9.06721, -68.6577),
	SOD("Sorocaba/SP", -23.5062, -47.45590),
	SWMU("Pacaraima/RR", 0, 0),
	TBT("Tabatinga/AM", 0, 0),
	TRQ("Taraucá/AC", 0, 0),
	TFF("Tefé/AM", 0, 0),
	THE("Teresina/PI", 0, 0),
	SBTS("Óbidos/PA", 0, 0),
	SNUN("Unaí/MG", 0, 0),
	SWXU("Xapuri/AC", 0, 0);

	private final String cidade;
	private final double latitude;
	private final double longitude;

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
