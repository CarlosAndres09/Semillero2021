package semillero.pruebasUnitarias;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.enums.EstadoEnum;
import com.hbt.semillero.enums.TematicaEnum;

import junit.framework.Assert;

/**
 * 
 * <b>Descripción:<b> Clase que determina las pruebas unitarias para los comics
 * <b>Caso de Uso:<b> 
 * @author Carlos Andres Ordoñez
 * @version
 */

public class OperacionesComicsTest {
	
	/**
	 * Constante que contendra el log de la clase CreacionComicsTest
	 */
	private final static Logger log = Logger.getLogger(OperacionesComicsTest.class);
	
	@BeforeTest
	public void inicializar() {
		BasicConfigurator.configure(); // Inicializa el logger con una configuracion basica
		log.info(":::::::::::::::::::::::::::: INICIAN PRUEBAS UNITARIAS :::::::::::::::::::::::::::: ");
	}
	
	
	@Test
	public void comprobarListadoComicsActivos() {
		log.info("Inicia ejecucion del metodo verificarEstadoComicsActivos()");
		/**
		 * Creando las listas ComicDTO 
		 */
		ArrayList<ComicDTO> listaComics = new ArrayList<ComicDTO>();
		/**
		 * Agregando informacion a cada comic
		 */
		ComicDTO comic1= new ComicDTO("1", "Avengers Forever", "The Golden", TematicaEnum.AVENTURAS, "1", 5, new BigDecimal(350000), "Carlos Pacheco", false, LocalDate.now(),EstadoEnum.ACTIVO , 10L);
		ComicDTO comic2= new ComicDTO("2", "Red Son", "Takeshi", TematicaEnum.AVENTURAS, "3", 5, new BigDecimal(250000), "Alan Moore", true, LocalDate.now(),EstadoEnum.INACTIVO , 60L);
		ComicDTO comic3= new ComicDTO("3", "Dangerous Habits", "The Golden", TematicaEnum.AVENTURAS, "4", 5, new BigDecimal(450000), "John Totleben", false, LocalDate.now(),EstadoEnum.INACTIVO , 20L);
		ComicDTO comic4= new ComicDTO("4", "Ultimates 2r", "Swamp", TematicaEnum.AVENTURAS, "6", 5, new BigDecimal(250000), "Peter Snejbjerg", false, LocalDate.now(),EstadoEnum.ACTIVO , 60L);
		ComicDTO comic5= new ComicDTO("5", "Deus ex Machina", "The Golden", TematicaEnum.AVENTURAS, "1", 5, new BigDecimal(650000), "James Robinson", true, LocalDate.now(),EstadoEnum.INACTIVO , 30L);
		ComicDTO comic6= new ComicDTO("6", "Half a Life", "The Golden", TematicaEnum.AVENTURAS, "9", 5, new BigDecimal(250000), "Chuck Dixon", false, LocalDate.now(),EstadoEnum.ACTIVO , 60L);
		ComicDTO comic7= new ComicDTO("7", "Squadron Supreme", "The Golden", TematicaEnum.AVENTURAS, "10", 5, new BigDecimal(750000), "Jim Aparo", false, LocalDate.now(),EstadoEnum.INACTIVO , 40L);
		ComicDTO comic8= new ComicDTO("8", "Rock of Ages", "Takeshi", TematicaEnum.AVENTURAS, "11", 5, new BigDecimal(950000), "Graham Nolan", true, LocalDate.now(),EstadoEnum.ACTIVO , 60L);
		ComicDTO comic9= new ComicDTO("9", "Return of Barry Allen", "The Golden", TematicaEnum.AVENTURAS, "1", 5, new BigDecimal(50000), "John Totleben", false, LocalDate.now(),EstadoEnum.INACTIVO , 50L);
		ComicDTO comic10= new ComicDTO("10", "Anatomy Lesson", "Swamp", TematicaEnum.AVENTURAS, "15", 5, new BigDecimal(330000), "Carlos Pacheco", true, LocalDate.now(),EstadoEnum.INACTIVO , 70L);
	
		/**
		 * Adicionando los comics a la lista de comics
		 */
		listaComics.add(comic1);
		listaComics.add(comic2);
		listaComics.add(comic3);
		listaComics.add(comic4);
		listaComics.add(comic5);
		listaComics.add(comic6);
		listaComics.add(comic7);
		listaComics.add(comic8);
		listaComics.add(comic9);
		listaComics.add(comic10);
		
		for(int i=0;i<listaComics.size();i++) {
			listaComics.get(i).getEstadoEnum();
			Assert.assertEquals("ACTIVO", EstadoEnum.ACTIVO);
		
		}
	
		log.info("Finaliza la ejecucion del metodo verificarEstadoComicsActivos()");

		
	}
	
	@Test
	public void comprobarListadoComicsInactivos() {
		log.info("Inicia ejecucion del metodo verificarEstadoComicsInactivos()");
		/**
		 * Creando las listas ComicDTO 
		 */
		ArrayList<ComicDTO> listaComics = new ArrayList<ComicDTO>();
		/**
		 * Agregando informacion a cada comic
		 */
		ComicDTO comic1= new ComicDTO("1", "Avengers Forever", "The Golden", TematicaEnum.AVENTURAS, "1", 5, new BigDecimal(350000), "Carlos Pacheco", false, LocalDate.now(),EstadoEnum.ACTIVO , 10L);
		ComicDTO comic2= new ComicDTO("2", "Red Son", "Takeshi", TematicaEnum.AVENTURAS, "3", 5, new BigDecimal(250000), "Alan Moore", true, LocalDate.now(),EstadoEnum.INACTIVO , 60L);
		ComicDTO comic3= new ComicDTO("3", "Dangerous Habits", "The Golden", TematicaEnum.AVENTURAS, "4", 5, new BigDecimal(450000), "John Totleben", false, LocalDate.now(),EstadoEnum.INACTIVO , 20L);
		ComicDTO comic4= new ComicDTO("4", "Ultimates 2r", "Swamp", TematicaEnum.AVENTURAS, "6", 5, new BigDecimal(250000), "Peter Snejbjerg", false, LocalDate.now(),EstadoEnum.ACTIVO , 60L);
		ComicDTO comic5= new ComicDTO("5", "Deus ex Machina", "The Golden", TematicaEnum.AVENTURAS, "1", 5, new BigDecimal(650000), "James Robinson", true, LocalDate.now(),EstadoEnum.INACTIVO , 30L);
		ComicDTO comic6= new ComicDTO("6", "Half a Life", "The Golden", TematicaEnum.AVENTURAS, "9", 5, new BigDecimal(250000), "Chuck Dixon", false, LocalDate.now(),EstadoEnum.ACTIVO , 60L);
		ComicDTO comic7= new ComicDTO("7", "Squadron Supreme", "The Golden", TematicaEnum.AVENTURAS, "10", 5, new BigDecimal(750000), "Jim Aparo", false, LocalDate.now(),EstadoEnum.INACTIVO , 40L);
		ComicDTO comic8= new ComicDTO("8", "Rock of Ages", "Takeshi", TematicaEnum.AVENTURAS, "11", 5, new BigDecimal(950000), "Graham Nolan", true, LocalDate.now(),EstadoEnum.ACTIVO , 60L);
		ComicDTO comic9= new ComicDTO("9", "Return of Barry Allen", "The Golden", TematicaEnum.AVENTURAS, "1", 5, new BigDecimal(50000), "John Totleben", false, LocalDate.now(),EstadoEnum.INACTIVO , 50L);
		ComicDTO comic10= new ComicDTO("10", "Anatomy Lesson", "Swamp", TematicaEnum.AVENTURAS, "15", 5, new BigDecimal(330000), "Carlos Pacheco", true, LocalDate.now(),EstadoEnum.INACTIVO , 70L);
	
		/**
		 * Adicionando los comics a la lista de comics
		 */
		listaComics.add(comic1);
		listaComics.add(comic2);
		listaComics.add(comic3);
		listaComics.add(comic4);
		listaComics.add(comic5);
		listaComics.add(comic6);
		listaComics.add(comic7);
		listaComics.add(comic8);
		listaComics.add(comic9);
		listaComics.add(comic10);
		

		
		
		try {
			for(int i=0;i<listaComics.size();i++) {
				listaComics.get(i).getEstadoEnum();
				Assert.assertEquals("INACTIVO", EstadoEnum.INACTIVO);
			}
			}
			catch(Exception e) {
				System.out.println("Se ha detectado que de "+ listaComics.size()+"Total");
			}
		
		log.info("Finaliza la ejecucion del metodo verificarEstadoComicsInactivos()");


		
		
	}



	


}
