package conversor;

public class ConversorMoeda implements  ConversaoFinanceira{



    @Override
     public void converterDolarParaReal(double dolar) {
         var valorConvertidoReal = dolar * 6.12;

        System.out.println(String.format(dolar +" Dólar  convertido para :" + valorConvertidoReal + "  R$"));
    }

    @Override
    public void converterRealParaDolar(double real) {

        var valorconvertidoDolar = real / 6.12;

        System.out.println(String.format(real +" Reais  convertido para :" + valorconvertidoDolar + "  US$") );
    }


}
