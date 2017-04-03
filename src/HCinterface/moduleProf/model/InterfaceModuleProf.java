package HCinterface.moduleProf.model;

import model.ModuleProf;
import view.MainFrame;

/**
 * Created by ambie on 01/04/2017.
 */
public class InterfaceModuleProf {
    private ModuleProf moduleProf;



    public InterfaceModuleProf(ModuleProf moduleProf) {
        this.moduleProf = moduleProf;

    }

    public ModuleProf getModuleProf() {
        return moduleProf;
    }
}
