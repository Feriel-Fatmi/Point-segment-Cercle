package ficheTD3;

public class Test {

	public static void main(String[] args) {
		// exo 1
		System.out.println("- Crée 3 point dans l'espace on utilisant 3 constructeurs différents");

		Point A = new Point();
		Point B = new Point(5, 5);
		Point C = new Point(3, 8);
		PointA E = new PointA(4,5); // E objet de la class PointA qui herite de Point
		PointNom F = new PointNom("F",5,10);// F objet de la class PointNom qui herite de Point
		

		System.out.println("Le point A mes coordonnées sont : A " + A.toString());
		System.out.println("Le point B mes coordonnées sont : B " + B.toString());
		System.out.println("Le point C mes coordonnées sont : C " + C.toString());
		System.out.println("================= ");
		System.out.println("Le point E "+E.toString());
		System.out.println(F.toString());
		System.out.println("Donner les image de A,B,C");

		System.out.println("L'image de A est : A-1:" + A.symertie().toString());

		System.out.println("L'image de B est : B-1:" + B.symertie().toString());

		System.out.println("L'image de C est : C-1:" + C.symertie().toString());
		
		System.out.println("L'image de E est : E-1:" + E.symertie().toString());
		
		System.out.println("L'image de F est : F-1:" + F.symertie().toString());
		// fin exo 1

		// exo2
		System.out.println("\n ");

		System.out.println("============================");
		System.out.println("Crée deux segment dans l'espace ");
		Segment AB = new Segment(A, B);
		Segment BC = new Segment(B, C);
		Segment EF = new Segment(E,F);

		System.out.println("Le segment AB =" + AB.distance(A, B));
		System.out.println("Le segment BC =" + BC.distance(B, C));
                System.out.println("Le segment EF =" + EF.distance(E, F));

		System.out.println("Crée l'image de segment  BC par rapport à l'axe des ordonnées");

		System.out.println("L'image de BC est CB" + BC.symetrie(B, C).toString());
		// fin exo 2

		// exo 3
		System.out.println("\n ");

		System.out.println("============================");
		System.out.println("Crée deux cercles différents dans l'espace ");
		Cercle c1 = new Cercle(4);
		Cercle c2 = new Cercle(B, 3);

		System.out.println("Le Cercle c1  : " + c1.toString() + "périmètre=" + c1.périmètre(c1.getRayon())
				+ " son image  c1 " + c1.symetrie(c1.centre).toString());
		System.out.println("Le Cercle c2  : " + c2.toString() + "périmètre=" + c2.périmètre(c2.getRayon())
				+ " son image  c2 " + c2.symetrie(c2.centre).toString());
	}

}
