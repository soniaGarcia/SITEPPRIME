package sv.gob.mh.sitep2.view;

import javax.faces.event.ActionEvent;
import org.omnifaces.cdi.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;
import sv.gob.mh.sitepcommon.domain.CAT_MUNICIPIO;
import sv.gob.mh.siteputil.service.CAT_MUNICIPIOService;
import sv.gob.mh.siteputil.service.base.BaseService;
import sv.gob.mh.siteputil.view.BaseView;


@Named(value= "cat_municipioView")
@ViewScoped
@Getter
@Setter
public class CAT_MUNICIPIOView extends BaseView<CAT_MUNICIPIO, Double> {

    @Inject
    private transient CAT_MUNICIPIOService cAT_MUNICIPIOService;

    @Override
    public BaseService<CAT_MUNICIPIO, Double> getService() {
        return cAT_MUNICIPIOService;
    }

    @Override
    public void prepareView(ActionEvent e) {
        super.prepareView(e);

    }
}