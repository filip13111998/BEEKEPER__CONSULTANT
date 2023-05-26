import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NadmorskaVisinaComponent } from './nadmorska-visina.component';

describe('NadmorskaVisinaComponent', () => {
  let component: NadmorskaVisinaComponent;
  let fixture: ComponentFixture<NadmorskaVisinaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NadmorskaVisinaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NadmorskaVisinaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
