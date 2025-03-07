import {defineConfig, UserConfig} from 'vite';
import react from '@vitejs/plugin-react';

export default defineConfig({
  plugins: [react()],
  test: {
    environment: 'jsdom',
    setupFiles: ['./react/__tests__/setup.ts'],
    testMatch: ['./react/__tests__/**/*.test.tsx'],
    globals: true,
  },
} as UserConfig)
