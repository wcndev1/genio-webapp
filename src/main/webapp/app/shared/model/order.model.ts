import { Moment } from 'moment';

export interface IOrder {
  id?: number;
  orderId?: number;
  orderCode?: number;
  custId?: number;
  productId?: number;
  startDate?: Moment;
  endDate?: Moment;
  activeFlag?: boolean;
  createDate?: Moment;
  createBy?: string;
  updateDate?: Moment;
  updateBy?: Moment;
}

export class Order implements IOrder {
  constructor(
    public id?: number,
    public orderId?: number,
    public orderCode?: number,
    public custId?: number,
    public productId?: number,
    public startDate?: Moment,
    public endDate?: Moment,
    public activeFlag?: boolean,
    public createDate?: Moment,
    public createBy?: string,
    public updateDate?: Moment,
    public updateBy?: Moment
  ) {
    this.activeFlag = this.activeFlag || false;
  }
}
