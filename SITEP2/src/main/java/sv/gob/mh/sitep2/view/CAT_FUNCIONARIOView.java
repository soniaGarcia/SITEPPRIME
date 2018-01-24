package sv.gob.mh.sitep2.view;

import javax.faces.event.ActionEvent;
import org.omnifaces.cdi.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;
import sv.gob.mh.sitepcommon.domain.CAT_FUNCIONARIO;
import sv.gob.mh.siteputil.service.CAT_FUNCIONARIOService;
import sv.gob.mh.siteputil.service.base.BaseService;
import sv.gob.mh.siteputil.view.BaseView;


@Named(value= "cat_funcionarioView")
@ViewScoped
@Getter
@Setter
public class CAT_FUNCIONARIOView extends BaseView<CAT_FUNCIONARIO, Double> {

    @Inject
    private transient CAT_FUNCIONARIOService cAT_FUNCIONARIOService;

    @Override
    public BaseService<CAT_FUNCIONARIO, Double> getService() {
        return cAT_FUNCIONARIOService;
    }

    @Override
    public void prepareView(ActionEvent e) {
        super.prepareView(e);

    }
}