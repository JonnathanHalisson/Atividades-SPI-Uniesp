package estacionamentoUniesp;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		App app = new App();
		
		String inputValue = JOptionPane.showInputDialog(app.menu());
		
		int option = Integer.parseInt(inputValue);
		
		while(option != 0 ) {
			if(option == 1) {
				String name = JOptionPane.showInputDialog("Digite a categoria da vaga(Exemplo: Carro, Moto, etc..)");
				app.createCategory(name);
		        JOptionPane.showConfirmDialog(null,"Categoria cadastrada com sucesso!", "Aviso", JOptionPane.DEFAULT_OPTION);
			}else if(option == 2) {
				String categoryOption = JOptionPane.showInputDialog(app.menuListCategories());
				int input = Integer.parseInt(categoryOption);
				Category c = app.findCategoryByIndex(input); 
				JOptionPane.showConfirmDialog(null,"Categoria " + c.getName() + " selecionada!", "Aviso", JOptionPane.DEFAULT_OPTION);
				
				String categoryValue = JOptionPane.showInputDialog(app.menuCategories(c));
				int categoryInput = Integer.parseInt(categoryValue);
				
				while(categoryInput != 0 ) {
					if(categoryInput == 1) {
						String name = JOptionPane.showInputDialog("Digite o nome para o sensor:");
						String serialNumber = JOptionPane.showInputDialog("Digite o numero de serie do sensor:");
						app.registerSensor(name, serialNumber, c);
				        JOptionPane.showConfirmDialog(null,"Sensor registro com sucesso!", "Aviso", JOptionPane.DEFAULT_OPTION);
					}else if(categoryInput == 2) {
				        JOptionPane.showConfirmDialog(null, app.numberSensorDeactivated(c) + " vagas livres", "Aviso", JOptionPane.DEFAULT_OPTION);
					}else if(categoryInput == 3) {
				        JOptionPane.showConfirmDialog(null, app.numberSensorActivated(c) + " vagas ocupadas", "Aviso", JOptionPane.DEFAULT_OPTION);
					}
					categoryValue = JOptionPane.showInputDialog(app.menuCategories(c));
					categoryInput = Integer.parseInt(categoryValue);
				}
					
			}
			inputValue = JOptionPane.showInputDialog(app.menu());
			option = Integer.parseInt(inputValue);
		}
	}

}
