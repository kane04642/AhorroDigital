package com.calidda.planQ.userinterface.gestionReemplazo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GestionReemplazoPOM extends PageObject {
    public static final Target LNK_GESTION_REEM = Target.the("Click en Gestiòn de reemplazo")
            .located(By.cssSelector("nav[id='sidenav-2'] img[alt='Gestión de Reemplazo']"));
    public static final Target LNK_PES_IMPEDIMENTOS = Target.the("Click pestaña impedimentos")
            .located(By.xpath("//a[normalize-space()='Impedimentos']"));
    public static final Target TXT_COD_PROYECTO = Target.the("Ingresar còdigo de proyecto")
            .located(By.xpath("//input[@placeholder='Ingresa el Código de Proyecto']"));
    public static final Target LST_PROYECTO = Target.the("Seleccionar proyecto")
            .located(By.xpath("//body[1]/app-root[1]/app-gestion-reemplazo[1]/section[1]/section[1]/div[1]/div[2]/app-card[1]/section[1]/div[1]/div[1]/div[1]/app-input-select[1]/div[1]/select[1]"));
    public static final Target LST_AN_PA = Target.the("Seleccionar año PA")
            .located(By.cssSelector("app-input-select[inputtitle='Año PA'] select[class='outline-none bg-gray-50 border-[1.2px] text-gray-900 text-md rounded-md focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5']"));
    public static final Target TXT_INVER_USD = Target.the("Ingresar inversiòn USD")
            .located(By.xpath("//input[@placeholder='Ingresa el Inversión (USD)']"));
    public static final Target TXT_LONG_IMPEDI = Target.the("Ingresar Long. de Impedimentos (m)")
            .located(By.xpath("//input[@placeholder='Ingresa la Long. de Impedimientos']"));
    public static final Target BTN_APLICAR= Target.the("Botòn aplicar busqueda")
            .located(By.cssSelector("div[class='visible'] div[class='flex justify-center mt-1 w-full'] div:nth-child(1)"));
    public static final Target BTN_LIMPIAR= Target.the("Botòn limpiar busqueda")
            .located(By.cssSelector("div[class='visible'] app-card section[class='contentCard bg-white'] div[class='p-1'] div p[class='mr-4 ml-2 pt-1 textBlue']"));
    public static final Target LNK_MAS_FILTROS = Target.the("Link mas filtros")
            .located(By.cssSelector("div[class='visible'] app-card section[class='contentCard bg-white'] div[class='p-1'] div p[class='cursor-pointer underline text-center mt-5 font-medium']"));
    public static final Target TXT_COD_MALLA = Target.the("Ingresar còdigo malla")
            .located(By.xpath("(//input[@placeholder='Ingresa el Código de Malla'])[1]"));
    public static final Target LST_CONSTRUCTOR= Target.the("Seleccionar constructor")
            .located(By.cssSelector("body > app-root:nth-child(1) > app-gestion-reemplazo:nth-child(3) > section:nth-child(1) > app-modal:nth-child(5) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > app-input-select:nth-child(5) > div:nth-child(1) > select:nth-child(2)"));
    public static final Target LST_CAUSAL_REEM = Target.the("Seleccionar causal de reemplazo")
            .located(By.cssSelector("app-input-select[inputtitle='Causal de Reemplazo'] select[class='outline-none bg-gray-50 border-[1.2px] text-gray-900 text-md rounded-md focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5']"));
    public static final Target LST_ING_RESPON= Target.the("Seleccionar ingeniero responsable")
            .located(By.cssSelector("app-input-select[inputtitle='Ingeniero Responsable'] select[class='outline-none bg-gray-50 border-[1.2px] text-gray-900 text-md rounded-md focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5']"));
    public static final Target LST_PROBLE_REAL = Target.the("Seleccionar problematica real")
            .located(By.cssSelector("app-input-select[inputtitle='Problemática Real'] select[class='outline-none bg-gray-50 border-[1.2px] text-gray-900 text-md rounded-md focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5']"));
    public static final Target TXT_ESTRATO_1 = Target.the("Seleccionar estrato 1")
            .located(By.xpath("//input[@placeholder='Ingrese el Estrato 1']"));
    public static final Target TXT_ESTRATO_2 = Target.the("Seleccionar estrato 2")
            .located(By.cssSelector("input[placeholder='Ingrese el Estrato 2']"));
    public static final Target TXT_ESTRATO_3 = Target.the("Seleccionar estrato 3")
            .located(By.cssSelector("input[placeholder='Ingrese el Estrato 3']"));
    public static final Target TXT_ESTRATO_4 = Target.the("Seleccionar estrato 4")
            .located(By.cssSelector("input[placeholder='Ingrese el Estrato 4']"));
    public static final Target TXT_ESTRATO_5 = Target.the("Seleccionar estrato 5")
            .located(By.cssSelector("input[placeholder='Ingrese el Estrato 5']"));
    public static final Target TXT_LONG_IMPEDIM = Target.the("Ingresar long de impedimentos")
            .located(By.cssSelector("app-input-text[class='sm:col-span-6 md:col-span-6 lg:col-span-3 xl:col-span-3 p-1 col-span-12'] input[placeholder='Ingresa la Long. de Impedimientos']"));
    public static final Target TXT_LONG_REEMPLAZO = Target.the("Ingresar long de reemplazo")
            .located(By.cssSelector("input[placeholder='Ingresa la Long. de Reemplazo']"));
    public static final Target TXT_FEC_PRESE_REEM = Target.the("Ingresar fecha present. reemplazo")
            .located(By.xpath("(//input[@id='dateInput'])[1]"));
    public static final Target TXT_FEC_REGISTRO= Target.the("Ingresar Fecha de Registro")
            .located(By.xpath("(//input[@id='dateInput'])[2]"));
    public static final Target LST_NO_REEMPLAZO= Target.the("Seleccionar No reemplazo")
            .located(By.cssSelector("app-input-select[inputtitle='N° Reemplazo'] select[class='outline-none bg-gray-50 border-[1.2px] text-gray-900 text-md rounded-md focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5']"));
    public static final Target LST_VALIDA_CARGO= Target.the("Seleccionar validaciòn cargo planos")
            .located(By.cssSelector("app-input-select[inputtitle='Validación Cargo Planos'] select[class='outline-none bg-gray-50 border-[1.2px] text-gray-900 text-md rounded-md focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5']"));
    public static final Target LST_VAL_CSP= Target.the("Seleccionar Validación Cargo Sustentos Permisos")
            .located(By.cssSelector("app-input-select[inputtitle='Validación Cargo Sustentos Permisos'] select[class='outline-none bg-gray-50 border-[1.2px] text-gray-900 text-md rounded-md focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5']"));
    public static final Target LST_VAL_RRCC= Target.the("Validación Cargo Sustentos RRCC")
            .located(By.cssSelector("app-input-select[inputtitle='Validación Cargo Sustentos RRCC'] select[class='outline-none bg-gray-50 border-[1.2px] text-gray-900 text-md rounded-md focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5']"));
    public static final Target LST_VALIDA_LEGAL= Target.the("Seleccionar validaciòn legalC")
            .located(By.cssSelector("app-input-select[inputtitle='Validación Legal'] select[class='outline-none bg-gray-50 border-[1.2px] text-gray-900 text-md rounded-md focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5']"));
    public static final Target LST_IMPORTANCIA= Target.the("Seleccionar importancia")
            .located(By.cssSelector("app-input-select[inputtitle='Importancia'] select[class='outline-none bg-gray-50 border-[1.2px] text-gray-900 text-md rounded-md focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5']"));
    public static final Target TXT_USU_RESPONSA= Target.the("Ingreso Usuarios Responsables")
            .located(By.cssSelector("input[placeholder='Buscar Responsables']"));
    public static final Target BTN_APLICAR_FILTROS= Target.the("Botòn aplicar")
            .located(By.cssSelector("div[class='w-24 ml-2'] p[class='col-span-3 text-white']"));




}
