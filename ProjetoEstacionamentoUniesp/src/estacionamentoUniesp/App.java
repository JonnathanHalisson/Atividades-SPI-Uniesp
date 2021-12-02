package estacionamentoUniesp;

import java.util.LinkedList;
import java.util.List;

public class App {
	private List<Sensor> sensors;
	private List<Category> categories;
	private List<SensorAnalytics> sensorsAnalytics;

	public App() {
		this.sensors = new LinkedList<Sensor>();
		this.categories = new LinkedList<Category>();
		this.sensorsAnalytics = new LinkedList<SensorAnalytics>();
	}
	
	public String menu() {
		return "Digite um numero\n1 - Cadastrar Categoria\n2 - Selecionar Categoria\n0 - Sair";
	}
	
	public String menuListCategories() {
		String text = "";
		int count = 1;
		
		for(Category c: this.categories) {
			text = text + count + " - " +c.getName() + "\n";
		}
		return text;
	}
	
	public Category findCategoryByIndex(int index) {
		return this.categories.get(index -1);
	}
	
	public String menuCategories(Category c) {
		return "Categoria: " + c.getName() + "\n1 - Registrar Sensor\n2 - Quantidade de vagas livre\n3 - Quantidade de vagas ocupadas \n0 - Voltar";
	}
	
	public void createCategory(String name) {
		Category c = new Category(name);
	
     	this.categories.add(c);
	}
	
	public void registerSensor(String name, String serialNumber, Category category) {
		Sensor s = new Sensor(serialNumber, false, name, category);
	
     	this.sensors.add(s);
	}
	
	
	public List<Sensor> getSensorsByCategory(Category category) {
		List<Sensor> tempList = new LinkedList<Sensor>();
		for(Sensor s : this.sensors){
			if(category.getName() == s.getCategory().getName()) {
				tempList.add(s);
			}
		}
		return tempList;	
	}
	
	public int numberSensorActivated(Category category) {
		int count = 0;
		for(Sensor s: getSensorsByCategory(category)) {
			if(s.isActivated()) {
				count = count + 1;
			}
		}
		return count;
	}
	
	public int numberSensorDeactivated(Category category) {
		return getSensorsByCategory(category).size() - numberSensorActivated(category);
	}
}
