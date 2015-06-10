package demo.client.local;

import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.jboss.errai.ioc.client.container.IOCBeanDef;
import org.jboss.errai.ioc.client.container.SyncBeanManager;
import org.jboss.errai.ui.nav.client.local.DefaultPage;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import org.livespark.formmodeler.rendering.client.view.ListView;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;

@Page( role = DefaultPage.class )
@Templated
@SuppressWarnings("rawtypes")
public class MainPage extends Composite {

    @Inject
    @DataField
    private VerticalPanel container;

    @Inject
    private SyncBeanManager beanManager;

    @PostConstruct
    private void init() {
        final Collection<IOCBeanDef<ListView>> listViewBeans = beanManager.lookupBeans( ListView.class );

        for ( IOCBeanDef<ListView> listViewBean : listViewBeans ) {
            if ( isInstantiable( listViewBean ) ) {
                final ListView instance = listViewBean.getInstance();
                container.add( instance );
            }
        }
    }

    private boolean isInstantiable( IOCBeanDef<ListView> listViewBean ) {
        return listViewBean.isConcrete() && listViewBean.isActivated();
    }

}
