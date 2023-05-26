import { ComponentFixture, TestBed } from '@angular/core/testing';

import { KosnicaComponent } from './kosnica.component';

describe('KosnicaComponent', () => {
  let component: KosnicaComponent;
  let fixture: ComponentFixture<KosnicaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ KosnicaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(KosnicaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
