import { Routes } from '@angular/router';
import { ShowProductsComponent } from './show-products/show-products.component';
import { AddProductsComponent } from './add-products/add-products.component';

export const routes: Routes = [
{component:ShowProductsComponent,path:"showProducts"},
{component:AddProductsComponent,path:"addProducts"}


];
