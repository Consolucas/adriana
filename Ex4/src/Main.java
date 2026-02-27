//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Balanco trimestre;
    trimestre = new Balanco();

    trimestre.setJan(15000);
    trimestre.setFev(17000);
    trimestre.setMar(23000);

    System.out.println(trimestre.calcMedia());

}
