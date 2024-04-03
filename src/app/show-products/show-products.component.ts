import { CommonModule } from '@angular/common';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';

@Component({
  selector: 'app-show-products',
  standalone: true,
  imports: [CommonModule,HttpClientModule,FormsModule],
  templateUrl: './show-products.component.html',
  styleUrl: './show-products.component.css'
})
export class ShowProductsComponent {
productId:number|undefined
lstOfProducts:any=[]


  handleSubmit(ProductForm:NgForm){
    this.productId=ProductForm.value.productId
    this.getById()
  }

  constructor(private http:HttpClient){
    this.getProducts()

  }

  getProducts(){
    this.http.get("http://localhost:8080/showAll").subscribe(
      (data)=>{
        this.lstOfProducts=data
      },(error)=>{
        alert("Error Occured")
      }

    )
  }
  getById(){
    
    this.http.get("http://localhost:8080/search-by-Id/"+this.productId).subscribe(
      data=>{
        this.lstOfProducts=data
      },Error=>{
        console.log(Error)
      }
    )
  }




}
