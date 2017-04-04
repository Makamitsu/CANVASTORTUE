package HCinterface.moduleEleve;

import model.ModuleEleve;

/**
 * Created by crousti on 01/04/2017.
 */


public class InterfaceModuleEleve {
    private ModuleEleve moduleElev;



    public InterfaceModuleEleve(ModuleEleve moduleElev) {
        this.moduleElev = moduleElev;

    }

    public ModuleEleve getModuleProf() {
        return moduleElev;
    }
}
