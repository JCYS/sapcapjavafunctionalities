package jcys.appmdk.handlers;


import cds.gen.adminservice.AdminService_;
import cds.gen.adminservice.BusinessPartners;
import cds.gen.adminservice.BusinessPartners_;
import cds.gen.api_business_partner.ApiBusinessPartner_;
import com.sap.cds.Result;
import com.sap.cds.services.cds.CdsReadEventContext;
import com.sap.cds.services.cds.CqnService;
import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.On;
import com.sap.cds.services.handler.annotations.ServiceName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@ServiceName(AdminService_.CDS_NAME)
public class AdminServiceHandler implements EventHandler {

    @Autowired
    @Qualifier(ApiBusinessPartner_.CDS_NAME)
    CqnService bupa;

    @On(entity = BusinessPartners_.CDS_NAME)
    Result readSuppliers(CdsReadEventContext context) {
        return bupa.run(context.getCqn());
    }

}
