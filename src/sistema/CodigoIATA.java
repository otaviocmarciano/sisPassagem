/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

/**
 *
 * @author ocmma
 */
public enum CodigoIATA {
    SBAM("Amapá¡/AP"),
	SWYN("Apuã­/AM"),
	APQ("Arapiraca/AL"),
	BAZ("Barcelos/AM"),
 	SWBI("Barreirinha/AM"),
 	BEL("Belém/PA"),
 	CNF("Confins/MG"),
 	PLU("Belo Horizonte/MG"),
 	SWBR("Borba/AM"),
 	SWBS("Brasileia/AC"),
 	BSB("Lago Sul/DF"),
 	SNCC("Calçoene/AP"),
 	VCP("Campinas/SP"),
 	CPQ("Campinas/SP"),
 	SBMT("São Paulo/SP"),
 	CAU("Caruaru/PE"),
 	CAF("Caraurari/AM"),
 	CAC("Cascavel/PR"),
 	SILQ("Cascavel/PR"),
 	CIZ("Coari/AM"),
 	CDJ("Conceissão do Araguaia/PA"),
 	CZS("Cruzeiro do Sul/AC"),
 	BFH("Curitiba/PR"),
 	CWB("São José dos Pinhais/PR"),
 	FEJ("Feijó/AC"),
 	SWFN("Manaus/AM"),
 	FLN("Florianópolis/SC"),
 	FOR("Fortaleza/CE"),
 	IGU("Foz do Iguaçu/PR"),
 	IZA("Goianá/MG "),
 	GYN("Goiânia/GO"),
 	GRU("Guarulhos/SP"),
 	IMP("Imperatriz/MA"),
 	JJD("Cruz/CE"),
 	JOI("Joinville/SC"),
 	JPA("Bayeux/PB"),
 	JDF("Juiz de Fora/MG"),
 	QDV("Jundiaí­/SP"),
 	MCP("Macapá/AP"),
	MAO("Manaus/AM"),
	SNML("Rio Largo/A L"),
	MCZ("Rio Largo/AL"),
	MVF("Mossoró/RN"),
	NVT("Navegantes/SC"),
	NAT("Sãoo Gonçalo do Amarante/RN"),
	SWNK("Boca do Acre/AM"),
	SBOI("Oiapoque/AP"),
	SNOZ("Paço do Lumiar/MA"),
	SWJV("Atalaia do Norte/AM"),
	PHB("Parnaíba­ba/PI"),
	SNPE("Penedo/AL"),
	PGZ("Ponta Grossa/PR"),
	POA("Porto Alegre/RS"),
	SNPG("Porto Grande/AP"),
	REC("Recife/PE"),
	RAO("Ribeirão Preto/SP"),
	RBR("Rio Branco/AC"),
 	SDU("Rio de Janeiro/RJ"),
 	GIG("Rio de Janeiro/RJ"),
 	SBJR("Rio de Janeiro/RJ"),
 	ROO("Rondonópolis/MT"),
 	RIA("Santa Maria/RS"),
 	SDOE("Santa Rosa do Purus/AC"),
 	SSZ("Guarujá¡/SP"),
 	QSC("São Carlos/SP"),
 	SLZ("Sãoo Luís/MA"),
 	CGH("São Paulo/SP"),
 	ZMD("Sena Madureira/AC"),
 	SOD("Sorocaba/SP"),
 	SWMU("Pacaraima/RR"),
 	TBT("Tabatinga/AM"),
 	TRQ("TaraucÃ¡/AC"),
 	TFF("Tefé/AM"),
 	THE("Teresina/PI"),
 	SBTS("Óbidos/PA"),
 	SNUN("Unaí­/MG"),
 	SWXU("Xapuri/AC");
        
    private final String cidade;
    CodigoIATA(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }
    

}
