package com.calidda.planQ.userinterface.planQuinquenal;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PlanQuinquenalPOM extends PageObject {
    public static final Target LNK_DASHBOARD = Target.the("Click en menù Plan Quinquenal")
            .located(By.cssSelector("nav[id='sidenav-2'] li:nth-child(3)"));
    public static final Target LNK_PES_QUINQUENAL = Target.the("Click en pestaña Plan Quinquenal")
            .located(By.cssSelector(".-mb-px.border-b-2.cursor-pointer.font-semibold.ml-4.mr-4.opacity-70.p-12.px-4.py-2.rounded-t.tabLinea.text-center.tituloTab"));
    public static final Target TXT_PERIODO_PQ = Target.the("Ingresar periodo PQ")
            .located(By.cssSelector("input[placeholder='Ingresar Periodo PQ']"));
    public static final Target BTN_APLICAR = Target.the("Botòb aplicar")
           .located(By.cssSelector(".flex.justify-center.mt-1.w-full"));
    public static final Target LST_ESTA_APROBA= Target.the("Seleccionar estado de aprobaciòn")
            .located(By.xpath("(//select[@class='outline-none bg-gray-50 border-[1.2px] text-gray-900 text-md rounded-md focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5'])[1]"));
    public static final Target DTB_RESULTADOS= Target.the("Validar se genera tabla de resultados")
            .located(By.cssSelector(".relative.scroolgrilla"));
    public static final Target CLD_FECHA_MOD= Target.the("Ingresar fecha de modificaciòn")
            .located(By.xpath("//app-input-date[@inputtitle='Fecha de Mod.']//input[@id='dateInput']"));
    public static final Target LST_USUARIO_MOD= Target.the("Seleccionar usuario modificò")
            .located(By.cssSelector("app-input-select[class='sm:col-span-5 md:col-span-4 lg:col-span-2 xl:col-span-2 p-1 col-span-6'] select[class='outline-none bg-gray-50 border-[1.2px] text-gray-900 text-md rounded-md focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5']"));
    public static final Target LNK_MAS_FILTROS= Target.the("click en mas filtros")
            .located(By.cssSelector(".cursor-pointer.underline.text-center.mt-5.font-medium"));
    public static final Target TXT_DESCIPCION= Target.the("Ingresa descripciòn para filtro")
            .located(By.xpath("(//input[@placeholder='Ingresa la descripción'])[1]"));
    public static final Target BTN_APLICAR_MF = Target.the("botón Aplicar")
            .located(By.xpath("//button[contains(@class, 'buttonModalAceptar') and .//p[text()='Aplicar']]"));
    public static final Target CLD_FECHA_REGISTRO= Target.the("Ingresar fecha de registro")
            .located(By.cssSelector("body > app-root:nth-child(1) > app-plan-quinquenal:nth-child(3) > section:nth-child(1) > app-modal:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > app-input-date:nth-child(5) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)"));
    public static final Target LST_USUARIO_REG= Target.the("Seleccionar usuario registro")
            .located(By.cssSelector("app-input-select[inputtitle='Usuario que Registró'] select[class='outline-none bg-gray-50 border-[1.2px] text-gray-900 text-md rounded-md focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5']"));
    public static final Target BTN_NUEVO_PLANQUIN= Target.the("Botòn nuevo registro plan quinquenal")
            .located(By.xpath("//p[normalize-space()='Nuevo Registro']"));
    public static final Target CLD_APROBACIONES= Target.the("Ingresar fecha aprobaciones")
            .located(By.xpath("//input[@id='dateInput']"));
    public static final Target TXT_DESCIPCION_NUE= Target.the("Ingresar descriciòn nuevo plan quinquenal")
            .located(By.xpath("//input[@id='descripcion']"));
    public static final Target BTN_GUARDAR= Target.the("Guardar nuevo plan quinquenal")
            .located(By.xpath("//p[normalize-space()='Guardar']"));
    public static final Target TXT_PERIDO_NUEV= Target.the("Ingresar periodo PQ nuevo plan quinquenal")
            .located(By.xpath("//input[@placeholder='Ingresar el Periodo PQ']"));
    public static final Target LST_ESTADO_APRO= Target.the("Seleccionar estado aprobaciòn nuevo plan quinquenal")
            .located(By.cssSelector("select[class='outline-none bg-gray-50 border-[1.2px] text-gray-900 text-md rounded-md focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5']"));
    public static final Target LBLCODIGO_OBLIGA= Target.the("Mensaje ingresar codigo de proyecto")
            .located(By.xpath("//pre[normalize-space()='Ingresar Codido de Proyecto']"));
    public static final Target MSG_ESTADO_APRO= Target.the("Mensaje estado aprobaciòn es obligatorio")
            .located(By.xpath("//pre[normalize-space()='Seleccionar Estado de Aprobación']"));
    public static final Target BTN_LIMPIAR= Target.the("Botòn limpiar")
            .located(By.xpath("//p[normalize-space()='Limpiar']"));
    public static final Target LNK_PES_PANUAL= Target.the("Pestaña plan anual")
            .located(By.xpath("//a[normalize-space()='Plan Anual']"));
}
