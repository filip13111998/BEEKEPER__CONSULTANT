import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PrirodaComponent } from './priroda.component';

describe('PrirodaComponent', () => {
  let component: PrirodaComponent;
  let fixture: ComponentFixture<PrirodaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PrirodaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PrirodaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
