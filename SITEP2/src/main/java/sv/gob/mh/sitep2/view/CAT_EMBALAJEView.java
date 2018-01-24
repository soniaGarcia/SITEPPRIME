package sv.gob.mh.sitep2.view;

import javax.faces.event.ActionEvent;
import org.omnifaces.cdi.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;
import sv.gob.mh.sitepcommon.domain.CAT_EMBALAJE;
import sv.gob.mh.siteputil.service.CAT_EMBALAJEService;
import sv.gob.mh.siteputil.service.base.BaseService;
import sv.gob.mh.siteputil.view.BaseView;


@Named(value= "cat_embalajeView")
@ViewScoped
@Getter
@Setter
public class CAT_EMBALAJEView extends BaseView<CAT_EMBALAJE, Long> {

    @Inject
    private transient CAT_EMBALAJEService cAT_EMBALAJEService;

    @Override
    public BaseService<CAT_EMBALAJE, Long> getService() {
        return cAT_EMBALAJEService;
    }

    @Override
    public void prepareView(ActionEvent e) {
        super.prepareView(e);

    }
}