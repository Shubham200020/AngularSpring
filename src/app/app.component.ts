import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { AddProductsComponent } from './add-products/add-products.component';
import { ShowProductsComponent } from './show-products/show-products.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,AddProductsComponent,ShowProductsComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Products';
  
}
