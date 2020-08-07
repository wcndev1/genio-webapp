import { Moment } from 'moment';

export interface IAuthor {
  id?: number;
  customerId?: number;
  customerName?: string;
  customerLastname?: number;
  orderId?: number;
  productId?: number;
  endDate?: Moment;
}

export class Author implements IAuthor {
  constructor(
    public id?: number,
    public customerId?: number,
    public customerName?: string,
    public customerLastname?: number,
    public orderId?: number,
    public productId?: number,
    public endDate?: Moment
  ) {}
}
