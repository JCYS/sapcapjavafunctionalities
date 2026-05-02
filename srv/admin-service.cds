using { appmdk.products as db } from '../db/schema';
using { API_BUSINESS_PARTNER as bupa } from './srv/external/API_BUSINESS_PARTNER';

service AdminService {
    entity Products   as projection on db.Products;
    entity Categories as projection on db.Categories;
    entity BusinessPartners as projection on bupa.A_BusinessPartner;
}
