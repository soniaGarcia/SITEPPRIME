package sv.gob.mh.sitep2.view;

import javax.faces.event.ActionEvent;
import org.omnifaces.cdi.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;
import sv.gob.mh.sitepcommon.domain.CAT_SEDE_TELEFONO;
import sv.gob.mh.siteputil.service.CAT_SEDE_TELEFONOService;
import sv.gob.mh.siteputil.service.base.BaseService;
import sv.gob.mh.siteputil.view.BaseView;


@Named(value= "cat_sede_telefonoView")
@ViewScoped
@Getter
@Setter
public class CAT_SEDE_TELEFONOView extends BaseView<CAT_SEDE_TELEFONO, Double> {

    @Inject
    private transient CAT_SEDE_TELEFONOService cAT_SEDE_TELEFONOService;

    @Override
    public BaseService<CAT_SEDE_TELEFONO, Double> getService() {
        return cAT_SEDE_TELEFONOService;
    }

    @Override
    public void prepareView(ActionEvent e) {
        super.prepareView(e);

    }
}