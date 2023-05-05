import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { TestService } from 'src/app/services/test.service';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent {

  constructor(private testService:TestService,private router:Router , private activatedRoute: ActivatedRoute) {
    // testService.printer();
    console.log("TEST POZVAN");
    // this.router.navigate(['/','home']);
    const idParam = this.activatedRoute.snapshot.paramMap.get('id');
    // const url = this.router.url.replace(idParam || '', '');
    // this.router.navigateByUrl(url);
    this.router.navigate(['/','home']);

    console.log("PARAMMM:::: " + idParam);
  }

}
