package com.calidda.planQ.userinterface.menus;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenusPOM extends PageObject {
    public static final Target LNK_DASHBOARD = Target.the("Click en dashboard")
            .located(By.xpath("(//img[@alt='dashboard'])[1]"));
    public static final Target LNK_HABI_DISTRITO = Target.the("Click en sub-menù Avance Habilitación / Distrito")
            .located(By.cssSelector(".-mb-px.border-b-2.cursor-pointer.font-semibold.ml-4.mr-4.opacity-70.p-12.px-4.py-2.rounded-t.tabLinea.text-center.tituloTab"));

    public static final Target LIS_PLAN = Target.the("Dar click en lista de plan")
            .located(By.xpath("(//select[./option[text()='Seleccionar']])[1]"));
           // .located(By.xpath("//div[1]//app-card[1]//section[1]//div[1]//div[1]//div[1]//app-input-select[1]//div[1]//select[1]"));
    public static final Target SLC_PLAN= Target.the("Seleccionar plan")
            .locatedBy("//option[contains(.,'{0}')]");
    public static final Target LIS_PERIODO_PQ = Target.the("Dar click en lista de periodo PQ")
            .located(By.cssSelector("app-input-select[inputtitle='Periodo PQ'] select[class='outline-none bg-gray-50 border-[1.2px] text-gray-900 text-md rounded-md focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5']"));
    public static final Target SLC_PERIODO_PQ= Target.the("Seleccionar periodo PQ")
            .locatedBy("//option[contains(.,'{0}')]");
    public static final Target TXT_AN_PQ = Target.the("Dar click en lista de año PQ")
            .located(By.cssSelector("input[placeholder='Ingresar Año PQ']"));
    public static final Target LIS_MATERIAL = Target.the("Dar click en lista de material")
            .located(By.cssSelector("body > app-root:nth-child(1) > app-dashboard:nth-child(3) > section:nth-child(1) > section:nth-child(3) > div:nth-child(2) > app-card:nth-child(1) > section:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > app-input-select:nth-child(4) > div:nth-child(1) > select:nth-child(2)"));
    public static final Target SLC_MATERIAL= Target.the("Seleccionar material")
            .locatedBy("//option[contains(.,'{0}')]");
    public static final Target BTN_APLICAR = Target.the("Dar click en botòn aplicar")
            .located(By.xpath("(//button[@type='button'])[2]"));

    public static final Target LNK_CONSTRU_DISTRITO = Target.the("Click en sub-menù Avance Construcción / Distrito")
            .located(By.xpath("//a[contains(text(), 'Avance Construcción / Distrito')]"));

    public static final Target LIS_PA= Target.the("Dar click en lista de PA")
            .located(By.cssSelector("app-input-select[inputtitle='PA'] select[class='outline-none bg-gray-50 border-[1.2px] text-gray-900 text-md rounded-md focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5']"));
    public static final Target SLC_PA= Target.the("Seleccionar PA")
            .locatedBy("//option[contains(.,'{0}')]");
    public static final Target LIS_MATERIAL_ANUAL = Target.the("Dar click en lista de material")
            .located(By.cssSelector("body > app-root:nth-child(1) > app-dashboard:nth-child(3) > section:nth-child(1) > section:nth-child(3) > div:nth-child(2) > app-card:nth-child(1) > section:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > app-input-select:nth-child(3) > div:nth-child(1) > select:nth-child(2)"));
    public static final Target SLC_MATERIAL_ANUAL= Target.the("Seleccionar material")
            .locatedBy("//option[contains(.,'{0}')]");
    public static final Target GRF_RESULTADOS = Target.the("Se genera grafica")
            .located(By.cssSelector(".highcharts-background"));

    public static final Target LIS_PLAN_CD = Target.the("Dar click en lista de plan")
            .located(By.xpath("//*[@id=\"scrollable\"]/app-root/app-dashboard/section/section/div[2]/app-card/section/div/div/div[1]/app-input-select[1]/div/select"));
    public static final Target SLC_PLAN_CD= Target.the("Seleccionar plan")
            .locatedBy("//option[contains(.,'{0}')]");
    public static final Target LIS_MATERIAL_CD = Target.the("Seleccionar material")
            .located(By.cssSelector("body > app-root:nth-child(1) > app-dashboard:nth-child(3) > section:nth-child(1) > section:nth-child(3) > div:nth-child(3) > app-card:nth-child(1) > section:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > app-input-select:nth-child(4) > div:nth-child(1) > select:nth-child(2)"));
    public static final Target BTN_APLICAR_CD = Target.the("Dar click en botòn aplicar en pestaña Avance Construcción / Distrito")
            .located(By.xpath("(//div[@class='flex justify-center mt-1 w-full'])[2]"));

}
