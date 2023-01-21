public class IndexWeight {

    public float calculate(float weight, float height) {
        float result = weight / (height * height);
        if (result < 16) {
            System.out.println("ИМТ - " + result + " Выраженный дефицит массы тела");
        } else if (result >= 16 && result < 18.5) {
            System.out.println("ИМТ - " + result + " Недостаточная масса тела (дефицит)");
        } else if (result >= 18.5 && result < 25) {
            System.out.println("ИМТ - " + result + " Норма");
        } else if (result >= 25 && result < 30) {
            System.out.println("ИМТ - " + result + " Избыточная масса тела (состояние, предшествующее ожирению)");
        } else if (result >= 30 && result < 35) {
            System.out.println("ИМТ - " + result + " Ожирение 1-й степени");
        } else if (result >= 35 && result < 40) {
            System.out.println("ИМТ - " + result + " Ожирение 2-й степени");
        } else {
            System.out.println("ИМТ - " + result + " Ожирение 3-й степени");
        }
        return result;
    }
}

