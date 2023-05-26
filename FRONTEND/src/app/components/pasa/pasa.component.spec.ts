import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PasaComponent } from './pasa.component';

describe('PasaComponent', () => {
  let component: PasaComponent;
  let fixture: ComponentFixture<PasaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PasaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PasaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
