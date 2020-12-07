package sistema;

import java.lang.Math;

/**
 * Classe que calcula a distância entre duas cidades.
 */
public class DistanciaCidades {

	private final static int RAIO_TERRESTRE = 6371;


	/**
	 * Método que calcula a distância entre cidades.
	 * @param latitudePartida
	 * @param longitudePartida
	 * @param latitudeDestino
	 * @param longitudeDestino
	 * @return
	 */
	public static double calcula(double latitudePartida, double longitudePartida, double latitudeDestino,
			double longitudeDestino) {

		double distanciaLatitudinal = Math.toRadians((latitudeDestino - latitudePartida));
		double distanciaLongitudinal = Math.toRadians((longitudeDestino - longitudePartida));

		latitudePartida = Math.toRadians(latitudePartida);
		latitudeDestino = Math.toRadians(latitudeDestino);

		double anguloCentral = Math.pow(Math.sin(distanciaLatitudinal / 2), 2) + Math.cos(latitudePartida)
				* Math.cos(latitudeDestino) * Math.pow(Math.sin(distanciaLongitudinal / 2), 2);

		return RAIO_TERRESTRE * (2 * Math.atan2(Math.sqrt(anguloCentral), Math.sqrt(1 - anguloCentral)));
	}

}
