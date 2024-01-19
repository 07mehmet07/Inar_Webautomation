package utils;

import pages.HomePage;
import pages.WebAutomationPage;
import pages.alerts.AlertTypes_Page;
import pages.autocomplete.Autocomplete_Accent_Folding_Page;
import pages.controlgroup.ToolbarTab;
import pages.dialog.Dialog_Modal_Form_Page;
import pages.draggable.AutoScrolling_Page;
import pages.draggable.ConstrainMovement;
import pages.draggable.Draggable_DefFunc_Page;
import pages.draggable.Handles_Page;
import pages.droppable.Droppable_Accept_Page;
import pages.droppable.Droppable_DefFunc_Page;
import pages.droppable.Droppable_Revert_Draggable_Position;
import pages.iframe.Iframe_Nested_Page;
import pages.iframe.Iframe_Normal_Page;
import pages.menu.Menu_Icons_Page;
import pages.progress_bar.Progress_Bar_DownLoading_Page;
import pages.resizable.Animate_Page;
import pages.resizable.Resizable_DefFunc_Page;
import pages.resizable.Resizable_Synchronous_Resize_Page;
import pages.resizable.Resizable_Text_Area_Page;
import pages.selectable.Selectable_DefFunc_Page;
import pages.selectable.Selectable_Serialize_Page;

public class Pages {


    private AlertTypes_Page alertTypesPage;
    private Animate_Page animatePage;
    private Autocomplete_Accent_Folding_Page autocompleteAccentFoldingPage;
    private AutoScrolling_Page autoScrollingPage;
    private ConstrainMovement constrainMovement;

    private Dialog_Modal_Form_Page modalFormPage;
    private Draggable_DefFunc_Page draggableDefFuncPage;
    private Droppable_Accept_Page acceptPage;
    private Droppable_DefFunc_Page droppableDefFuncPage;
    private Droppable_Revert_Draggable_Position revertDraggablePosition;
    private Handles_Page handlesPage;
    private HomePage homePage;
    private Iframe_Nested_Page nestedIframePage;
    private Iframe_Normal_Page normalPage;
    private Menu_Icons_Page iconsPage;
    private Progress_Bar_DownLoading_Page downLoadingPage;
    private Resizable_DefFunc_Page resizableDefFuncPage;
    private Resizable_Synchronous_Resize_Page synchronousResize;
    private Resizable_Text_Area_Page textAreaPage;
    private Selectable_DefFunc_Page selectableDefFuncPage;
    private Selectable_Serialize_Page serializePage;

    private ToolbarTab toolbarTab;
    private WebAutomationPage webAutomationPage;

    public Pages() {
        homePage = new HomePage();
        webAutomationPage = new WebAutomationPage();
        draggableDefFuncPage = new Draggable_DefFunc_Page();
        autoScrollingPage = new AutoScrolling_Page();
        droppableDefFuncPage = new Droppable_DefFunc_Page();
        resizableDefFuncPage = new Resizable_DefFunc_Page();
        selectableDefFuncPage = new Selectable_DefFunc_Page();
        nestedIframePage = new Iframe_Nested_Page();
        alertTypesPage = new AlertTypes_Page();
        animatePage = new Animate_Page();
        constrainMovement = new ConstrainMovement();
        handlesPage = new Handles_Page();
        acceptPage = new Droppable_Accept_Page();
        revertDraggablePosition = new Droppable_Revert_Draggable_Position();
        synchronousResize = new Resizable_Synchronous_Resize_Page();
        serializePage = new Selectable_Serialize_Page();
        normalPage = new Iframe_Normal_Page();
        textAreaPage = new Resizable_Text_Area_Page();
        autocompleteAccentFoldingPage = new Autocomplete_Accent_Folding_Page();
        iconsPage = new Menu_Icons_Page();
        downLoadingPage = new Progress_Bar_DownLoading_Page();
        modalFormPage = new Dialog_Modal_Form_Page();
        toolbarTab = new ToolbarTab();
    }

    public ToolbarTab getToolbarTab() {
        return toolbarTab;
    }

    public Dialog_Modal_Form_Page getModalFormPage() {
        return modalFormPage;
    }

    public Menu_Icons_Page getIconsPage() {
        return iconsPage;
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public WebAutomationPage getWebAutomationPage() {
        return webAutomationPage;
    }
    public Draggable_DefFunc_Page getDraggableDefFuncPage() {
        return draggableDefFuncPage;
    }
    public AutoScrolling_Page getAutoScrollingPage() {
        return autoScrollingPage;
    }
    public Autocomplete_Accent_Folding_Page getAutocompleteAccentFoldingPage() { return autocompleteAccentFoldingPage;}
    public Droppable_DefFunc_Page getDroppableDefFuncPage() {
        return droppableDefFuncPage;
    }
    public Resizable_DefFunc_Page getResizableDefFuncPage() {
        return resizableDefFuncPage;
    }
    public Selectable_DefFunc_Page getSelectableDefFuncPage() {
        return selectableDefFuncPage;
    }
    public Iframe_Nested_Page getNestedIframePage() {
        return nestedIframePage;
    }
    public AlertTypes_Page getAlertTypesPage() {
        return alertTypesPage;
    }
    public Animate_Page getAnimatePage() {
        return animatePage;
    }
    public ConstrainMovement getConstrainMovement() {
        return constrainMovement;
    }
    public Handles_Page getHandlesPage() {
        return handlesPage;
    }
    public Droppable_Accept_Page getAcceptPage() {
        return acceptPage;
    }
    public Droppable_Revert_Draggable_Position getRevertDraggablePosition() { return revertDraggablePosition;}
    public Resizable_Synchronous_Resize_Page getSynchronousResize() {
        return synchronousResize;
    }
    public Selectable_Serialize_Page getSerializePage() {
        return serializePage;
    }
    public Iframe_Normal_Page getNormalPage() {
        return normalPage;
    }
    public Resizable_Text_Area_Page getTextAreaPage() {
        return textAreaPage;
    }
    public Progress_Bar_DownLoading_Page getDownLoadingPage() {
        return downLoadingPage;
    }
}
