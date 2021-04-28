import { HeaderService } from './header.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  menus: string[];

  constructor(private headerService: HeaderService) {

    this.menus = headerService.getMenu();
  }

  ngOnInit(): void {
  }

}
