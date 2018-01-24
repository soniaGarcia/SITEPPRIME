package sv.gob.mh.sitep2.view;

import javax.faces.event.ActionEvent;
import org.omnifaces.cdi.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;
import sv.gob.mh.sitepcommon.domain.CAT_SEDE;
import sv.gob.mh.siteputil.service.CAT_SEDEService;
import sv.gob.mh.siteputil.service.base.BaseService;
import sv.gob.mh.siteputil.view.BaseView;


@Named(value= "cat_sedeView")
@ViewScoped
@Getter
@Setter
public class CAT_SEDEView extends BaseView<CAT_SEDE, Double> {

    @Inject
    private transient CAT_SEDEService cAT_SEDEService;

    @Override
    public BaseService<CAT_SEDE, Double> getService() {
        return cAT_SEDEService;
    }

    @Override
    public void prepareView(ActionEvent e) {
        super.prepareView(e);

    }
}